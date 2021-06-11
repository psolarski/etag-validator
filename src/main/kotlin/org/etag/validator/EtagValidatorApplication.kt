package org.etag.validator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EtagValidatorApplication

fun main(args: Array<String>) {
    runApplication<EtagValidatorApplication>(*args)
}
