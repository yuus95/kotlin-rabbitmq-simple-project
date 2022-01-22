package com.example.simplekotlinrabbitmq

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class SimpleKotlinRabbitmqApplication

fun main(args: Array<String>) {
    runApplication<SimpleKotlinRabbitmqApplication>(*args)
}


