package com.yp.rpc.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ImportResource(locations= {"classpath:spring.xml"})
//@ComponentScan(basePackages = {"com.yp.rpc","com.xxx.rpc"})
public class RpcServiceApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(RpcServiceApplication.class);

    public static void main(String[] args) {
        LOGGER.debug("start server");
        SpringApplication.run(RpcServiceApplication.class, args);
    }
}
