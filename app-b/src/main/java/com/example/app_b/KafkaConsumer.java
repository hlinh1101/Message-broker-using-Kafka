package com.example.app_b;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    @KafkaListener(topics = "user-topic-v2", groupId = "app-b-group", containerFactory = "userKafkaListenerFactory")
    public void listenUser(User user) {
        System.out.println("App B get user: " + user.getName() + " - age: " + user.getAge());
    }
}
