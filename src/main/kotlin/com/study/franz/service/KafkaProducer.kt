package com.study.franz.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class KafkaProducer {
    companion object {
        private const val TOPIC = "my-topic"
    }

    @Autowired
    private lateinit var kafkaTemplate: KafkaTemplate<String, String>

    fun sendMessage(message: String) {
        kafkaTemplate.send(TOPIC, message)
    }
}