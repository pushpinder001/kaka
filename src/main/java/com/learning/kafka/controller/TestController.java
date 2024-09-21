package com.learning.kafka.controller;

import com.learning.kafka.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private Producer producer;

    @GetMapping("/message")
    public void sendMessage() {
        producer.sendMessage("Hello .......");
    }
}
