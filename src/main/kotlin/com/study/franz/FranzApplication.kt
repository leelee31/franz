package com.study.franz

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FranzApplication

fun main(args: Array<String>) {

	runApplication<FranzApplication>(*args)
	println("lalala")
}
