package com.example.kafka.producer;

import com.example.kafka.dto.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class TopicProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private KafkaTemplate<String, com.sample.avro.Message> kafkaMessageTemplate;

    public void send(String message) {
        kafkaTemplate.send("myTopic3", message).thenAccept(t -> System.out.println(t.toString()));
        System.out.println("Mensagem enviada: " + message);
    }

    public void sendMessageObject(Message message) {

        com.sample.avro.Message avroMessage = com.sample.avro.Message.newBuilder()
                .setMessage(message.getMessage())
                .setId(message.getId())
                .build();

        kafkaMessageTemplate.send("myTopic4", avroMessage);
        System.out.println("Mensagem enviada: " + avroMessage);
    }

}
