package com.example.demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

public class KafkaConfig {

//    create topic
    @Bean
    public NewTopic myTopic() {
        return TopicBuilder.name("my-topic")
                .partitions(10)
                .build();
    }

    @Bean
    public NewTopic jsonTopic(){
        return TopicBuilder.name("json-topic")
                .build();
    }
}
