package com.example.springcloudstream;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.annotation.StreamRetryTemplate;
import org.springframework.stereotype.Component;

/**
 * @author FENGQINHONG
 * @date 2022/07/28
 */
public class Listener {

    @StreamListener(value = MySink.KAFKA_INPUT_TEST)
    public void listenKafkaTest(String msg) {
        System.out.println("receive " + msg);
    }
}
