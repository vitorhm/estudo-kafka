package com.example.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@org.springframework.boot.autoconfigure.SpringBootApplication
@EnableWebMvc
@EnableKafka
@ComponentScan(basePackages = "com.example.kafka")
public class SpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class, args);
    }

}
