package com.yp.rpc.client.config;

import com.xxx.rpc.client.RpcProxy;
import com.yp.rpc.register.redis.RedisServiceDiscover;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

@Configuration
public class RpcRedisConfig {

    @Value("${redisAddress}")
    private String redisAddress;

    @Autowired
    private RedisServiceDiscover redisServiceDiscover;

    @Bean
    public RedisServiceDiscover redisServiceDiscover(){
       Jedis jedis = new Jedis(redisAddress.split(":")[0], Integer.valueOf(redisAddress.split(":")[1]));
        return new RedisServiceDiscover(jedis);
    }

    @Bean
    public RpcProxy rpcProxy(){
        return new RpcProxy(redisServiceDiscover);
    }
}
