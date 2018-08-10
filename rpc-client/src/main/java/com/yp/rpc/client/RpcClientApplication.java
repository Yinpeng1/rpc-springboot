package com.yp.rpc.client;

import com.xxx.rpc.client.RpcProxy;
import com.xxx.rpc.sample.api.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class RpcClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(RpcClientApplication.class, args);
//        ApplicationContext context = SpringApplication.run(RpcClientApplication.class, args);
//        RpcProxy rpcProxy = context.getBean(RpcProxy.class);
//
//        HelloService helloService = rpcProxy.create(HelloService.class);
//        String result = helloService.hello("1");
//        System.out.println(result);
    }
}
