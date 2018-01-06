package com.example.demokotlin.controller

import org.slf4j.LoggerFactory
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.awt.PageAttributes

@RestController
@RequestMapping(path = ["hello"], produces = [MediaType.TEXT_PLAIN_VALUE])
class HelloController {
    private val log = LoggerFactory.getLogger(HelloController::class.java)

    @GetMapping(path = ["world"])
    fun greeting() = "Hello world!"

    @GetMapping(path = ["world2"])
    fun greeting2(): String {
        log.debug("greeting2")
        return "Hello, world"
    }
}