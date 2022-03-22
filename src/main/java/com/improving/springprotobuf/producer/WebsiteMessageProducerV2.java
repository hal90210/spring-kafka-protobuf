package com.improving.springprotobuf.producer;

import com.improving.springprotobuf.generated.v2.model.Author;
import com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage;
import com.improving.springprotobuf.generated.v2.model.WebsiteMessagePayload;
import com.improving.springprotobuf.generated.v2.model.WebsiteMessagePayload.Version;
import com.improving.springprotobuf.kafka.MessageProducer;
import com.improving.springprotobuf.model.MessageRequest;
import com.improving.springprotobuf.generated.v2.model.Author.AuthorMessage;
import com.improving.springprotobuf.generated.v2.model.WebsiteMessagePayload.WebsiteMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class WebsiteMessageProducerV2 implements MessageProducer {

    private static final Logger logger = LoggerFactory.getLogger(WebsiteMessageProducerV2.class);
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

        Author.AuthorMessage commentAuthor  = Author.AuthorMessage
                .newBuilder()
                .setFirstName("That")
                .setLastName("OneCommenter")
                .setId(UUID.randomUUID().toString())
                .build();

        CommentMessage comment = CommentMessage.newBuilder().setContent("First!").setAuthor(commentAuthor).build();
        CommentMessage comment2 = CommentMessage.newBuilder().setContent("Oops I guess I wasn't first").setAuthor(commentAuthor).build();

        WebsiteMessage wMsg = WebsiteMessage
                .newBuilder()
                .setId(UUID.randomUUID().toString())
                .setContent(message.getContent())
                .setAuthor(messageAuthor)
                .setVersion(Version.V2)
                .addAllComments(Arrays.asList(comment, comment2))
                .build();

        this.kafkaTemplate.send(TOPIC, wMsg.getId(), wMsg);
    }
}

