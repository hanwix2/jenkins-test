package com.example.jenkinstest.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class TestServiceTest {

    @InjectMocks
    private TestService testService;

    @Test
    public void getTestMessage() {
        String msg = testService.getTestMessage();
        assertEquals("test message", msg);
    }

}