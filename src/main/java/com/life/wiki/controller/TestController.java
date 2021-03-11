package com.life.wiki.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${test.hello}")
    String test;

    @GetMapping("/hello")
    public String hello(){
        return "Hello World " + test;
    }

    @PostMapping ("/hello/post")
    public String hellop(String name){
        return "Hello World "+name;
    }
}
