package com.example.demo.controler;

import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoControler {

    @Autowired
    private DemoService demoService;

    @GetMapping("/hi")
    public String hi(@RequestParam String name){
        return this.demoService.hi(name);
    }
}
