package com.szdhc.common.redis;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.*;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zouke
 */
@Configuration
public class JedisConfig extends CachingConfigurerSupport {
    private Logger LOGGER = LoggerFactory.getLogger(JedisConfig.class);

    /**
     * SpringSession  需要注意的就是redis需要2.8以上版本，然后开启事件通知，在redis配置文件里面加上
     * notify-keyspace-events Ex
     * Keyspace notifications功能默认是关闭的（默认地，Keyspace 时间通知功能是禁用的，因为它或多或少会使用一些CPU的资源）。
     * 或是使用如下命令：
     * redis-cli config set notify-keyspace-events Egx
     * 如果你的Redis不是你自己维护的，比如你是使用阿里云的Redis数据库，你不能够更改它的配置，那么可以使用如下方法：在applicationContext.xml中配置
     * <util:constant static-field="org.springframework.session.data.redis.config.ConfigureRedisAction.NO_OP"/>
     *
     * @return
     */

    @Value("${spring.redis.node1.host:127.0.0.1}")
    private String node1Host;

    @Value("${spring.redis.node1.port:0}")
    private int node1Port;

    @Value("${spring.redis.node2.host:127.0.0.1}")
    private String node2Host;

    @Value("${spring.redis.node2.port:0}")
    private int node2Port;

    @Value("${spring.redis.node3.host:127.0.0.1}")
    private String node3Host;

    @Value("${spring.redis.node3.port:0}")
    private int node3Port;

    @Value("${spring.redis.node4.host:127.0.0.1}")
    private String node4Host;

    @Value("${spring.redis.node4.port:0}")
    private int node4Port;

    @Value("${spring.redis.node5.host:127.0.0.1}")
    private String node5Host;

    @Value("${spring.redis.node5.port:0}")
    private int node5Port;

    @Value("${spring.redis.node6.host:127.0.0.1}")
    private String node6Host;

    @Value("${spring.redis.node6.port:0}")
    private int node6Port;

    @Value("${spring.redis.timeout}")
    private int timeout;

    @Value("${spring.redis.pool.max-active}")
    private int maxActive;

    @Value("${spring.redis.pool.max-idle}")
    private int maxIdle;

    @Value("${spring.redis.pool.min-idle}")
    private int minIdle;

    @Value("${spring.redis.pool.max-wait}")
    private long maxWaitMillis;

    @Value("${spring.redis.connection_timeout:2000}")
    private int connectionTimeout;

    @Value("${spring.redis.so_timeout:2000}")
    private int soTimeout;

    @Value("${spring.redis.max_attempts:10}")
    private int maxAttempts;

    private static final String defaultHost = "127.0.0.1";

    private static final int defaultPort = 0;

    @Bean
    public JedisCluster jedisClusterFactory() {
        Set<HostAndPort> nodes = new HashSet<HostAndPort>();
        if (!defaultHost.equals(node1Host) && !(defaultPort == node1Port)) {
            nodes.add(new HostAndPort(node1Host, node1Port));
            LOGGER.info("redis node1地址：" + node1Host + ":" + node1Port);
        }
        if (!defaultHost.equals(node2Host) && !(defaultPort == node2Port)) {
            nodes.add(new HostAndPort(node2Host, node2Port));
            LOGGER.info("redis node2地址：" + node2Host + ":" + node2Port);
        }
        if (!defaultHost.equals(node3Host) && !(defaultPort == node3Port)) {
            nodes.add(new HostAndPort(node3Host, node3Port));
            LOGGER.info("redis node3地址：" + node3Host + ":" + node3Port);
        }
        if (!defaultHost.equals(node4Host) && !(defaultPort == node4Port)) {
            nodes.add(new HostAndPort(node4Host, node4Port));
            LOGGER.info("redis node4地址：" + node4Host + ":" + node4Port);
        }
        if (!defaultHost.equals(node5Host) && !(defaultPort == node5Port)) {
            nodes.add(new HostAndPort(node5Host, node5Port));
            LOGGER.info("redis node5地址：" + node5Host + ":" + node5Port);
        }
        if (!defaultHost.equals(node6Host) && !(defaultPort == node6Port)) {
            nodes.add(new HostAndPort(node6Host, node6Port));
            LOGGER.info("redis node6地址：" + node6Host + ":" + node6Port);
        }
        JedisCluster jedisCluster = null;
        if (!nodes.isEmpty()) {
            GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
            poolConfig.setMaxIdle(maxIdle);
            poolConfig.setMaxWaitMillis(maxWaitMillis);
            poolConfig.setMaxTotal(maxActive);
            poolConfig.setMinIdle(minIdle);
            jedisCluster = new JedisCluster(nodes, connectionTimeout, soTimeout, maxAttempts, poolConfig);
        LOGGER.info("JedisCluster注入成功！");
        }else{
            LOGGER.info("JedisCluster注入失败，请检查配置文件！");
        }


        return jedisCluster;
    }

}
