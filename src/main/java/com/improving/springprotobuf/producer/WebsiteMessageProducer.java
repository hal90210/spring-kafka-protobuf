package com.improving.springprotobuf.producer;

import com.improving.springprotobuf.generated.v1.model.Comment.CommentMessage;
import com.improving.springprotobuf.kafka.MessageProducer;
import com.improving.springprotobuf.model.MessageRequest;
import com.improving.springprotobuf.generated.v1.model.Author.AuthorMessage;
import com.improving.springprotobuf.generated.v1.model.WebsiteMessagePayload.WebsiteMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.UUID;

@Service
public class WebsiteMessageProducer implements MessageProducer {

    private static final Logger logger = LoggerFactory.getLogger(WebsiteMessageProducer.class);
    private static final String TOPIC = "website-messages";

    @Autowired
    private KafkaTemplate<String, WebsiteMessage> kafkaTemplate;

    public void sendMessage(MessageRequest message) {
        logger.info(String.format("#### -> Producing message -> %s", message));

        // Would normally look up author by id, but this is just an example app
        AuthorMessage messageAuthor  = AuthorMessage
                    .newBuilder()
                    .setFirstName(message.getAuthor().getFirstName())
                    .setLastName(message.getAuthor().getLastName())
                    .setId(UUID.randomUUID().toString())
                    .build();

        AuthorMessage commentAuthor  = AuthorMessage
                .newBuilder()
                .setFirstName("Darth")
                .setLastName("Maul")
                .setId(UUID.randomUUID().toString())
                .build();

        CommentMessage comment = CommentMessage.newBuilder().setContent("Great post").setAuthor(commentAuthor).build();

        WebsiteMessage wMsg = WebsiteMessage
                .newBuilder()
                .setId(UUID.randomUUID().toString())
                .setContent(message.getContent())
                .setAuthor(messageAuthor)
                .setTopic("test-topic")
                .addComments(comment)
                .build();


        this.kafkaTemplate.send(TOPIC, wMsg.getId(), wMsg);
    }
}

