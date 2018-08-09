package com.yp.rpc.provider.config;

import com.xxx.rpc.server.RpcServer;
import com.yp.rpc.register.redis.RedisServiceRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

@Configuration
public class RpcRedisConfig {

    @Value("${redisAddress}")
    private String redisAddress;

    @Value("${serviceAddress}")
    private String serviceAddress;

    @Autowired
    private RedisServiceRegister redisServiceRegister;

//    @Bean
//    public RedisServiceRegister redisServiceRegister(){
//        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
//        jedisPoolConfig.setMaxIdle(10);
//        jedisPoolConfig.setMinIdle(0);
//        jedisPoolConfig.setMaxTotal(10);
//        jedisPoolConfig.setMaxWaitMillis(1000);
//        jedisPoolConfig.setNumTestsPerEvictionRun(2);
//        RedisServiceRegister redisServiceRegister = new RedisServiceRegister(jedisPoolConfig,redisAddress);
//        return redisServiceRegister;
//    }

    @Bean
    public RedisServiceRegister redisServiceRegister(){
        Jedis jedis = new Jedis(redisAddress.split(":")[0], Integer.valueOf(redisAddress.split(":")[1]));
        return new RedisServiceRegister(jedis);
    }

    @Bean
    public RpcServer initServer(){
        RpcServer rpcServer = new RpcServer(serviceAddress, redisServiceRegister);
        return rpcServer;
    }
}
