package com.example.springcloudstream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author FENGQINHONG
 * @date 2022/07/28
 */
public interface MySink {

    String KAFKA_INPUT_TEST = "kafka_input_test";

    @Input("kafka_input_test")
    SubscribableChannel kafkaInputTest();

}
