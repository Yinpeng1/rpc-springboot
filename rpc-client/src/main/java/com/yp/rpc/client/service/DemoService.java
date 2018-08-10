package com.yp.rpc.client.service;


import com.xxx.rpc.client.annotation.RpcAutowired;
import com.xxx.rpc.sample.api.HelloService;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @RpcAutowired
    HelloService helloService;

    public String sayHello(String name){
        return helloService.hello(name);
    }
}
