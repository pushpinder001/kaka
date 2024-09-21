package com.learning.kafka.controller;

import com.learning.kafka.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class TestController {
    private static Random random = new Random();

    @Autowired
    private Producer producer;

    @GetMapping("/message")
    public void sendMessage() {
        for(int i=0; i<50; i++) {
            producer.sendMessage("Hello" + random.nextInt(100000));
        }
    }
}
