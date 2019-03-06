package com.szdhc.common.httpclient;

import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * 连接池管理
 * @author zouke
 */
@Configuration
public class ComPoolingHttpClientConnectionManager {
    /**
     * 连接池最大连接数
     */
    @Value("${httpclient.config.connMaxTotal}")
    private int connMaxTotal = 20;

    /**
     * 路由数
     */
    @Value("${httpclient.config.maxPerRoute}")
    private int maxPerRoute = 20;

    /**
     * 连接存活时间，单位为s
     *   
     */
    @Value("${httpclient.config.timeToLive}")
    private int timeToLive = 60;

    @Bean
    public PoolingHttpClientConnectionManager poolingHttpClientConnectionManager() {
        PoolingHttpClientConnectionManager poolingHttpClientConnectionManager = new PoolingHttpClientConnectionManager(60, TimeUnit.SECONDS);
        poolingHttpClientConnectionManager.setMaxTotal(this.connMaxTotal);
        poolingHttpClientConnectionManager.setDefaultMaxPerRoute(this.maxPerRoute);
        return poolingHttpClientConnectionManager;
    }

}
