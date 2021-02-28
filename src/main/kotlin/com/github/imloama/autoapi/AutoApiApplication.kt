package com.github.imloama.autoapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AutoApiApplication

fun main(args: Array<String>) {
	runApplication<AutoApiApplication>(*args)
}
