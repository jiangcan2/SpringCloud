package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DemoService {

    @Autowired
    private RestTemplate restTemplate;

    public String hi(String name){
        return this.restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
}
