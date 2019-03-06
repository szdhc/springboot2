package com.szdhc.common.httpclient;

import org.apache.http.HttpHost;
import org.apache.http.impl.conn.DefaultProxyRoutePlanner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * HttpClient代理
 *
 * @author zouke
 */
@Configuration
public class ComDefaultProxyRoutePlanner {

    @Value("${httpclient.config.proxyhost}")
    private String proxyHost;

    @Value("${httpclient.config.proxyPort}")
    private int proxyPort = 8080;

    @Bean
    public DefaultProxyRoutePlanner defaultProxyRoutePlanner() {
        HttpHost httpHost = new HttpHost(this.proxyHost, this.proxyPort);
        return new DefaultProxyRoutePlanner(httpHost);
    }
}
