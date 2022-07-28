package com.example.springcloudstream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.integration.annotation.Router;
import org.springframework.messaging.MessageChannel;

/**
 * @author FENGQINHONG
 * @date 2022/07/28
 */
public interface MySource {

    String KAFKA_OUTPUT_TEST = "kafka_output_test";

    @Output("kafka_output_test")
    MessageChannel kafkaOutputTest();
}
