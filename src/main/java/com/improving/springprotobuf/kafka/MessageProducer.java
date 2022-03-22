package com.improving.springprotobuf.kafka;

import com.improving.springprotobuf.model.MessageRequest;

public interface MessageProducer {
    void sendMessage(MessageRequest message);
}
