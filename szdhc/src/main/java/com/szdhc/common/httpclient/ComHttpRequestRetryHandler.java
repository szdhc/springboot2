package com.szdhc.common.httpclient;

import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.protocol.HttpContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.net.ssl.SSLException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.UnknownHostException;

/**
 * HttpClient重试处理机制
 * @author zouke
 */
@Configuration
public class ComHttpRequestRetryHandler {

    @Value("${httpclient.config.retryTime}")
    private int retryTime;

    @Bean
    public HttpRequestRetryHandler httpRequestRetryHandler(){
        // 请求重试
        final int retryTime = this.retryTime;
        return new HttpRequestRetryHandler() {
            @Override
            public boolean retryRequest(IOException e, int executionCount, HttpContext httpContext) {
                // Do not retry if over max retry count,如果重试次数超过了retryTime,则不再重试请求
                if (executionCount >= retryTime) {
                    return false;
                }
                // 服务端断掉客户端的连接异常
                if (e instanceof NoHttpResponseException) {
                    return true;
                }
                // time out 超时重试
                if (e instanceof InterruptedIOException) {
                    return true;
                }
                // Unknown host
                if (e instanceof UnknownHostException) {
                    return false;
                }
                // Connection refused
                if (e instanceof ConnectTimeoutException) {
                    return false;
                }
                // SSL handshake exception
                if (e instanceof SSLException) {
                    return false;
                }
                HttpClientContext clientContext = HttpClientContext.adapt(httpContext);
                HttpRequest request = clientContext.getRequest();
                if (!(request instanceof HttpEntityEnclosingRequest)) {
                    return true;
                }
                return false;
            }
        };
    }

}
