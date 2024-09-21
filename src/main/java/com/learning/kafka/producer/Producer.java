package com.learning.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Producer {
    private static Random random = new Random();

    @Autowired
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final String TOPIC_NAME= "order-topic"; // Replace with your desired topic name

    public Producer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        kafkaTemplate.send(TOPIC_NAME, "key" + random.nextInt(4), message);
        System.out.println("Message " + message +
                " has been sucessfully sent to the topic: " + TOPIC_NAME);
    }
}
