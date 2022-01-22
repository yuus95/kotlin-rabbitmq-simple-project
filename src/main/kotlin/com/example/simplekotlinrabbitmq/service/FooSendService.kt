package com.example.simplekotlinrabbitmq.service

import org.springframework.amqp.core.AmqpTemplate
import org.springframework.stereotype.Service

@Service
class FooSendService(
        private val rabbitTemplate: AmqpTemplate
) {
    fun send(message: String) {
//       converAndSend(exchangeName,routingKey,message)
//       converAndSend(routingKey,message)
        rabbitTemplate.convertAndSend("foobar.direct.exchange", "foobar", message)
    }
}