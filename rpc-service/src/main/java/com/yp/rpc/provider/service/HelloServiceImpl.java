package com.yp.rpc.provider.service;

import com.xxx.rpc.sample.api.HelloService;
import com.xxx.rpc.sample.api.Person;
import com.xxx.rpc.server.RpcService;
import com.yp.rpc.provider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String hello(String name) {
        String nm = userMapper.getUserName(Integer.valueOf(name));
        return "Hello!" + nm;
//        return "Hello! " + name;
    }

    @Override
    public String hello(Person person) {
        return "Hello! " + person.getFirstName() + " " + person.getLastName();
    }
}
