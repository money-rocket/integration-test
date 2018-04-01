package com.money.rocket.integrationtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorksController {


    @GetMapping("/")
    public String saysHello() {
        return "Container is working";
    }
}
