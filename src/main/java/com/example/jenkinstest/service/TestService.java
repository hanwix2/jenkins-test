package com.example.jenkinstest.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String getTestMessage() {
        return "test message";
    }

    public String getAnotherMessage() {
        return "another message";
    }

}
