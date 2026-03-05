package org.example.producer;

import lombok.RequiredArgsConstructor;
import org.example.producer.model.MessageDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/kafka")
public class MessageProduceController {
    private final MessageProduceService messageProduceService;
//    @GetMapping("/send")
//    public void send(String topic, String message) {
//        messageProduceService.sendMessage(topic, message);
//    }

    @GetMapping("/sendDto")
    public void send(@RequestBody MessageDto.Abcd dto) {
        messageProduceService.sendMessage("abcd", dto);
    }
}
