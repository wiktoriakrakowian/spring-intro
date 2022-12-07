package com.example;

import org.springframework.stereotype.Component;

@Component("messageService")
public class MyNameMessageService implements MessageService {
    String message = "Wiktoria Krakowian";
    public String getMessage() {
        return message;
    }
}
