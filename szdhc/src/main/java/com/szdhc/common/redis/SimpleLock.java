package com.szdhc.common.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.JedisCluster;

/**
 * @author zouke
 */
public class SimpleLock {
    private static Logger logger = LoggerFactory.getLogger(SimpleLock.class);
    private JedisLock jedisLock;
    private String lockKey;
    private JedisCluster jedis;
    private int timeoutMsecs;
    private int expireMsecs;

    public SimpleLock(String lockKey, JedisCluster jedis) {
        this(lockKey, 120000, 300000, jedis);
    }

    public SimpleLock(String lockKey, int timeoutMsecs, int expireMsecs, JedisCluster jedis) {
        this.lockKey = lockKey;
        this.jedis = jedis;
        this.timeoutMsecs = timeoutMsecs;
        this.expireMsecs = expireMsecs;
        this.jedisLock = new JedisLock(jedis, lockKey.intern(), timeoutMsecs, expireMsecs);
    }

    public synchronized void wrap(Runnable runnable) throws Exception {
        long begin = System.currentTimeMillis();
        try {
            logger.info(
                    "begin lock,lockKey={},timeoutMsecs={},expireMsecs={}",
                    lockKey,
                    timeoutMsecs,
                    expireMsecs);
            if (jedisLock.acquire()) { // 启用锁
                runnable.run();
            } else {
                logger.info("The time wait for lock more than [{}] ms ", timeoutMsecs);
                throw new Exception("can not get lock");
            }
        } catch (Throwable t) {
            // 分布式锁异常
            logger.warn(t.getMessage(), t);
            throw t;
        } finally {
            this.lockRelease(jedisLock);
        }
        logger.info("[{}]cost={}", lockKey, System.currentTimeMillis() - begin);
    }

    /**
     * 释放锁
     * @param lock
     */
    private void lockRelease(JedisLock lock) {
        if (lock != null) {
            try {
                lock.release();
            } catch (Exception e) {

            }
        }
        logger.debug(
                "release logck,lockKey={},timeoutMsecs={},expireMsecs={}",
                lockKey,
                timeoutMsecs,
                expireMsecs);
    }
}
