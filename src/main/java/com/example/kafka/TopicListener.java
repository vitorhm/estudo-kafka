package com.example.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TopicListener {

    @KafkaListener(topics = "myTopic3", groupId = "A")
    public void consumeMyTopicA(ConsumerRecord<String, String> payload) {
        System.out.println("Mensagem consumida A1: " + payload.value() + " / partition: " + payload.partition());
    }

    @KafkaListener(topics = "myTopic3", groupId = "A")
    public void consumeMyTopicA2(ConsumerRecord<String, String> payload) {
        System.out.println("Mensagem consumida A2: " + payload.value() + " / partition: " + payload.partition());
    }

}
