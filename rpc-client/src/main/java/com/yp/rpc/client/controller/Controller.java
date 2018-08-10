package com.yp.rpc.client.controller;


import com.yp.rpc.client.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    DemoService demoService;


    @RequestMapping("/hello")
    public void sayHello(){
        System.out.println(demoService.sayHello("1"));
    }
}
