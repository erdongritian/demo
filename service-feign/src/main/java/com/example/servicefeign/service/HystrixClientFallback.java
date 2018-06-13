package com.example.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallback implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
