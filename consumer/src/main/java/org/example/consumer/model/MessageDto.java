package org.example.consumer.model;

import lombok.Getter;
import lombok.ToString;

public class MessageDto {
    @ToString
    @Getter
    public static class Abcd {
        private Long idx;
        private String abcd01;
        private String abcd02;
    }
}
