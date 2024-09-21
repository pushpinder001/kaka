package com.learning.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer2 {
    @KafkaListener(topics = "order-topic", groupId = "id-1", id = "I',m1")
    public void consumeMessage(String message) {
        System.out.println("Consumer 2 Received message: " + message);
    }
}
