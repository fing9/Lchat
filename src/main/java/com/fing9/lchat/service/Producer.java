package com.fing9.lchat.service;

import com.fing9.lchat.domain.Message;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Producer {

    private static final Logger log = LoggerFactory.getLogger(Producer.class);

    private final RabbitTemplate rabbitTemplate;

    public void sendMessage(Message message) {
        rabbitTemplate.convertAndSend("hello.exchange", "hello.key", message);
    }

}
