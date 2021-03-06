package dev.polazzo.serviceapplication

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class ServiceApplication

fun main(args: Array<String>) {
    runApplication<ServiceApplication>(*args)
}
