package com.improving.springprotobuf.controller;

import com.improving.springprotobuf.model.Comment;
import com.improving.springprotobuf.model.MessageRequest;
import com.improving.springprotobuf.producer.WebsiteMessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/message")
public class WebsiteMessageController {

    private final WebsiteMessageProducer producer;

    @Autowired
    WebsiteMessageController(@Qualifier("websiteMessageProducer") WebsiteMessageProducer producer) {
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
