package com.yp.rpc.client.config;

import com.xxx.rpc.client.RpcProxy;
import com.xxx.rpc.client.annotationProxy.AnnotatonSetProxy;
import com.yp.rpc.register.redis.RedisServiceDiscover;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RpcRedisConfig {

    @Value("${redisAddress}")
    private String redisAddress;

    @Autowired
    private RedisServiceDiscover redisServiceDiscover;

    @Bean
    public RedisServiceDiscover redisServiceDiscover(){
        return new RedisServiceDiscover(redisAddress);
    }

    @Bean
    public RpcProxy rpcProxy(){
        return new RpcProxy(redisServiceDiscover);
    }

    @Bean
    public AnnotatonSetProxy annotatonSetProxy(){
        return new AnnotatonSetProxy("com.yp.rpc.client");
    }
}
