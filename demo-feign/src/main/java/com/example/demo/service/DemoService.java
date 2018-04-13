package com.example.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.config.FeignConfig;
import com.example.demo.service.hystric.DemoServiceHystric;

@FeignClient(value = "service-hi",fallback = DemoServiceHystric.class,configuration = FeignConfig.class)
//@FeignClient(value = "service-hi",fallback = DemoServiceHystric.class)
public interface DemoService {

    @GetMapping("/hi")
    public String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
