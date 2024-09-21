package com.learning.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @KafkaListener(topics = "test-topic", groupId = "id-1")
    public void consumeMessage(String message) {
        System.out.println("Received message: " + message);
    }
}
