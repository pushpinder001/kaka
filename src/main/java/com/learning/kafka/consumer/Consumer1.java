package com.learning.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer1 {
    @KafkaListener(topics = "order-topic", groupId = "id-1", id = "I'm 2")
    public void consumeMessage(String message) {
        System.out.println("Consumer 1 Received message: " + message);
    }
}
