package com.example;
import org.springframework.stereotype.Component;
import java.util.Random;

@Component("messageService")
public class RandomTextMessageService implements MessageService {
    String[] arr = {"Kuba", "Piotr", "Wiktoria", "Adrian", "Tomasz", "Konrad", "Kamil", "Hubert", "Grzegorz", "Mateusz"};

    @Override
    public String getMessage() {
        Random generator = new Random();
        return arr[generator.nextInt(10)];
    }
}
