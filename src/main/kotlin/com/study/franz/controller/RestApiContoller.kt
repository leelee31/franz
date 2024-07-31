package com.study.franz.controller

import com.study.franz.service.KafkaProducer
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class RestApiContoller(private val producer: KafkaProducer) {

    @GetMapping("/log")
    fun sendMessage(@RequestParam("message") message: String) {
        producer.sendMessage(message)
    }
}