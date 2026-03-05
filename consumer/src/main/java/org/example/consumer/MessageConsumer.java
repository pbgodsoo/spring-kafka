package org.example.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MessageConsumer {

    @KafkaListener(topics = "abcd", groupId = "abcd-group-1")
    public void consume(String message) {
        log.debug("MessageConsumer - consume : {}", message);
    }
}
