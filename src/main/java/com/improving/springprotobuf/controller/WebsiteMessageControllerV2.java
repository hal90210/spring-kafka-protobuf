package com.improving.springprotobuf.controller;

import com.improving.springprotobuf.model.Comment;
import com.improving.springprotobuf.model.MessageRequest;
import com.improving.springprotobuf.producer.WebsiteMessageProducer;
import com.improving.springprotobuf.producer.WebsiteMessageProducerV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v2/message")
public class WebsiteMessageControllerV2 {

    private final WebsiteMessageProducerV2 producer;

    @Autowired
    WebsiteMessageControllerV2(@Qualifier("websiteMessageProducerV2") WebsiteMessageProducerV2 producer) {
        this.producer = producer;
    }

    @PostMapping(value = "/publish")
    public void handleNewMessage(@RequestBody MessageRequest message) {

        this.producer.sendMessage(message);
    }

    @PutMapping("/{id}/comment")
    public void addComment(@RequestBody Comment comment, @PathVariable Long id) {

        //this.producer.sendMessage(comment);
    }


}
