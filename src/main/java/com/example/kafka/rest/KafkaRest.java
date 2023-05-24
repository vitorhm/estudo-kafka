package com.example.kafka.rest;

import com.example.kafka.dto.Message;
import com.example.kafka.producer.TopicProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teste")
public class KafkaRest {

    @Autowired
    private TopicProducer topicProducer;

    @GetMapping("/{message}")
    public void publishSimpleMessage(@PathVariable("message") String message) {
        topicProducer.send(message);
    }

    @PostMapping("/avro")
    public void publishObject(@RequestBody Message message) {
        topicProducer.sendMessageObject(message);
    }

}
