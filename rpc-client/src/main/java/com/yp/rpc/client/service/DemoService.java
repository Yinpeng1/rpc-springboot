package com.yp.rpc.client.service;


import com.xxx.rpc.client.annotation.RpcAutowired;
import com.xxx.rpc.sample.api.HelloService;
import com.xxx.rpc.sample.api.Person;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @RpcAutowired
    HelloService helloService;

    public String sayHello(String name){
        return helloService.hello(name);
    }

    public Person getPerson(String name){
        return helloService.getPeople(name);
    }
}
