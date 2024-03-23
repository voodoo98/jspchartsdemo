package com.example.jspchartsdemo.backend.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MainController {

    @GetMapping(value = "/status")
    public String getStatus() {
        return "It is working...";
    }

}