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

    @GetMapping("/1")
    public String test1() {
        return testService.getTestMessage();
    }

    @GetMapping("/2")
    public String test2() {
        return testService.getAnotherMessage();
    }

    @GetMapping("/3")
    public String test3() {
        return testService.getMoreMessage();
    }

    @GetMapping("/4")
    public String test4() {
        return testService.getBetterMessage();
    }

}
