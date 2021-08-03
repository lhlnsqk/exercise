package com.example.ssmdemo.controller;

import com.example.ssmdemo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello(){
        helloService.hello();
        return "controller hello";
    }
}
