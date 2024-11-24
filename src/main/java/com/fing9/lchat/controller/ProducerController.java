package com.fing9.lchat.controller;

import com.fing9.lchat.domain.Message;
import com.fing9.lchat.service.Producer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProducerController {

    private final Producer producer;

    @PostMapping("/send")
    public String send(@RequestBody Message message) {
        producer.sendMessage(message);
        return "Message sent to the RabbitMQ JavaInUse Successfully";
    }

}
