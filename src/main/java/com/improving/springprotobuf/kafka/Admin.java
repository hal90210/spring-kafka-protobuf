package com.improving.springprotobuf.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.stereotype.Component;

@Configuration
public class Admin {

    @Bean
    public NewTopic websiteMessageTopic() {
        return TopicBuilder.name("website-messages")
                .partitions(3)
                .replicas(1)
                .build();
    }

    @Bean
    public NewTopic messageCommentTopic() {
        return TopicBuilder.name("message-comments")
                .partitions(3)
                .replicas(1)
                .build();
    }
}
