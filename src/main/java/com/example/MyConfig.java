package com.example;
import org.springframework.context.annotation.*;

@Configuration
public class MyConfig {
    @Bean
    @Scope("prototype")
    public RandomTextMessageService messageService(){
        return new RandomTextMessageService();
    }

    @Bean
    @Scope("prototype")
    public MyNameMessageService randomMessageService(){
        return new MyNameMessageService();
    }
}
