package com.example.simplekotlinrabbitmq.config

import org.springframework.amqp.core.Binding
import org.springframework.amqp.core.BindingBuilder
import org.springframework.amqp.core.DirectExchange
import org.springframework.amqp.core.Queue
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Rabbitmq {

    private val topicExchangeName = "topic-message"

    //큐 생성
    @Bean
    fun queue(): Queue {
        return Queue("foobar.name", false)
    }

    // 익스체인지 생성
    @Bean
    fun foobarDirectExchange(): DirectExchange {
        return DirectExchange("foobar.direct.exchange")
    }

    //라우팅을 맵핑한 바인딩을 생성
    @Bean
    fun foobarBinding(foobarDirectExchange: DirectExchange, foobarQueue: Queue): Binding {
        return BindingBuilder.bind(foobarQueue).to(foobarDirectExchange).withQueueName()
    }
}