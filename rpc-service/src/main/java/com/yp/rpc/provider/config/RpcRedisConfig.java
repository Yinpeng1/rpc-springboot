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

    @Bean
    public RedisServiceRegister redisServiceRegister(){
        Jedis jedis = new Jedis(redisAddress.split(":")[0], Integer.valueOf(redisAddress.split(":")[1]));
        return new RedisServiceRegister(redisAddress);
    }

    @Bean
    public RpcServer initServer(){
        RpcServer rpcServer = new RpcServer(serviceAddress, redisServiceRegister);
        return rpcServer;
    }
}
