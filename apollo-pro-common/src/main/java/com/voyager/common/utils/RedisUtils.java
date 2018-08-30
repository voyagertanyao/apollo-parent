package com.voyager.common.utils;

import io.lettuce.core.RedisClient;
import io.lettuce.core.RedisURI;
import io.lettuce.core.api.StatefulRedisConnection;

/**
 * redis工具类
 */
public class RedisUtils {
    /**
     * 获取redis 连接
     * @return
     */
    public static StatefulRedisConnection<String, String> getConnection() {
        RedisURI redisURI = RedisURI.Builder.redis("localhost",6379).withPassword("password").withDatabase(1).build();
        RedisClient redisClient = RedisClient.create(redisURI);
        return redisClient.connect();
    }
}
