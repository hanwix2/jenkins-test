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

    public String getMoreMessage() {
        return "more message";
    }

    public String getBetterMessage() {
        return "better message";
    }

    public String getNormalMessage() {
        return "normal message";
    }
}
