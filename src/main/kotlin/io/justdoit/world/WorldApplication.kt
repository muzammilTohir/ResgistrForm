package io.justdoit.world

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WorldApplication

fun main(args: Array<String>) {
    runApplication<WorldApplication>(*args)
}
