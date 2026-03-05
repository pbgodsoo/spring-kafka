package org.example.consumer;

import lombok.extern.slf4j.Slf4j;
import org.example.consumer.model.MessageDto;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MessageConsumer {

//    @KafkaListener(topics = "abcd", groupId = "abcd-group-1")
//    public void consume(String message) {
//        log.debug("MessageConsumer - consume : {}", message);
//    }
    @KafkaListener(topics = "abcd", groupId = "abcd-group-1",
    // 내가 받는 Dto의 타입이 어떤 타입인지 지정
    properties = "spring.json.value.default.type:com.example.consumer.model.MessageDto.Abcd")
    public void consume(
            @Header(KafkaHeaders.RECEIVED_KEY) Long key,
            @Payload MessageDto.Abcd dto
    ) {
        log.debug("MessageConsumer - consume : {}={}", key, dto.toString());
    }
}
