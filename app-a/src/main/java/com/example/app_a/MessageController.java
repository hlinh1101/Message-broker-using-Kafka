package com.example.app_a;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.kafka.core.KafkaTemplate;

@RestController
@RequestMapping("/send")
public class MessageController {

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    @PostMapping("/user")
    public String sendUser(@RequestBody User user) {
        kafkaTemplate.send("test-topic", user);
        return "Đã gửi user: " + user.getName();
    }
}
