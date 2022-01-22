package com.example.simplekotlinrabbitmq.config

import com.example.simplekotlinrabbitmq.service.FooSendService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class ApplicationRunner:ApplicationRunner {

    @Autowired
    lateinit var fooSendService: FooSendService

    override fun run(args: ApplicationArguments?) {
        fooSendService.send("heelo")
        println("---------")


    }


}