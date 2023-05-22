package com.example.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class KafkaRest {

    @Autowired
    private TopicProducer topicProducer;

    @GetMapping("/{message}")
    public void sendMessage(@PathVariable("message") String message) {
        topicProducer.send(message);
    }

}
