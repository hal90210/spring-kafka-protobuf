package com.improving.springprotobuf.consumer;

import com.google.protobuf.DynamicMessage;
import com.google.protobuf.InvalidProtocolBufferException;
import com.improving.springprotobuf.generated.v1.model.WebsiteMessagePayload.WebsiteMessage;
import com.improving.springprotobuf.kafka.MessageConsumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WebsiteMessageListener implements MessageConsumer {

    private final Logger logger = LoggerFactory.getLogger(WebsiteMessageListener.class);

    @KafkaListener(topics = "website-messages", groupId = "group_id_v1")
    public void processEvent(ConsumerRecord<String, DynamicMessage> record) {

        WebsiteMessage message = null;
        try {
            message = WebsiteMessage.newBuilder().build().getParserForType().parseFrom(record.value().toByteArray());
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
            return;
        }

        logger.info(String.format("#### -> Consuming message -> %s", message.toString()));
        logger.info(String.format("#### -> Topic -> %s", message.getTopic()));
    }
}
