package org.example.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.producer.model.MessageDto;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MessageProduceService {
//    private final KafkaTemplate<String, String> kafkaTemplate;
    private final KafkaTemplate<Long, MessageDto.Abcd> kafkaTemplate;

//    public void sendMessage(String topic, String message) {
//        log.debug("MessageProducer - sendMessage : [{}] - {}", topic, message);
//        kafkaTemplate.send(topic, message);
//    }
    public void sendMessage(String topic, MessageDto.Abcd dto) {

        kafkaTemplate.send(topic, dto.getIdx(), dto);
    }
}
