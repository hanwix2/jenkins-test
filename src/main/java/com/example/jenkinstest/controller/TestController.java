package com.example.jenkinstest.controller;

import com.example.jenkinstest.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/test")
public class TestController {

    private TestService testService;

    @GetMapping
    public String test() {
        return testService.getTestMessage();
    }

}
