package com.example.springcloudstream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author FENGQINHONG
 * @date 2022/07/28
 */
@Component
public class Producer {

    @Resource
    private MySource source;

    public void send() {
        source.kafkaOutputTest().send(MessageBuilder.withPayload("testtesttest").build());
    }
}
