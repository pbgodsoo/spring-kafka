package org.example.producer.model;

import lombok.Getter;

public class MessageDto {

    @Getter
    public static class Abcd {
        private Long idx;
        private String abcd01;
        private String abcd02;
    }
}