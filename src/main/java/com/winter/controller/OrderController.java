package com.winter.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController("/order")
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

/*    @GetMapping("/getById")
    public String getById() {
        return restTemplate.getForObject("http://localhost:9999/eureka/", String.class);
    }*/

}
