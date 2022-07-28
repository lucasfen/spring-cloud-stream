package com.example.springcloudstream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringcloudstreamApplication.class)
@RunWith(Runner.class)
class SpringcloudstreamApplicationTests {

    @Autowired
    private Producer producer;

    @Test
    void contextLoads() {
        producer.send();
    }

}
