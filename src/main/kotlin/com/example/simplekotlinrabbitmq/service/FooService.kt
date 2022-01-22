package com.example.simplekotlinrabbitmq.service

import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Service

@Service
class FooService {


    @RabbitListener(queues = ["foobar"])
    fun listen(message:String){
        println("rabbitMq에서 받은 메세지 =   "+message)
    }
}