package com.example.demo.service.hystric;

import com.example.demo.service.DemoService;
import org.springframework.stereotype.Component;

@Component
public class DemoServiceHystric implements DemoService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
