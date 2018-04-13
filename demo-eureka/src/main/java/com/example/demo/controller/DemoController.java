package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String hi(@RequestParam String name){
        return "hi "+name+",i am from port:" +port;
    }

    @GetMapping("/hi2")
    public String hi2(@RequestParam String name){
        return "hi2 "+name+",i am from port:" +port;
    }
}
