package com.yp.rpc.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RpcServiceApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(RpcServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RpcServiceApplication.class, args);
    }
}
