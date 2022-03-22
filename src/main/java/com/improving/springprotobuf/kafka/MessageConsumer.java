package com.improving.springprotobuf.kafka;

import com.google.protobuf.DynamicMessage;
import org.apache.kafka.clients.consumer.ConsumerRecord;

public interface MessageConsumer {

    void processEvent(ConsumerRecord<String, DynamicMessage> record);
}
