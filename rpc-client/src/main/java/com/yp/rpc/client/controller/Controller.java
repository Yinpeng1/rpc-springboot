package com.yp.rpc.client.controller;


import com.xxx.rpc.sample.api.Person;
import com.yp.rpc.client.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    DemoService demoService;


    @RequestMapping("/hello")
    public String sayHello(){
       return(demoService.sayHello("1"));
    }

    @RequestMapping("/getInfo")
    public Person getInformation(String name){
        return(demoService.getPerson(name));
    }
}
