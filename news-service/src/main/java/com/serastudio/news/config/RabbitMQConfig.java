package com.serastudio.news.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    public static final String QUEUE_NAME = "eventQueue";

    @Bean
    public Queue eventQueue() {
        return new Queue(QUEUE_NAME, false);
    }

}
