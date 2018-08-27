package com.cholet.training.eventSourcingCQRSdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EventSourcingCqrsDemoApplication

fun main(args: Array<String>) {
    runApplication<EventSourcingCqrsDemoApplication>(*args)
}
