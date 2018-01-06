package com.example.demokotlin.controller

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.awt.PageAttributes

@RestController
@RequestMapping(path = ["hello"], produces = [MediaType.TEXT_PLAIN_VALUE])
class HelloController {
    @GetMapping(path = ["world"])
    fun greeting() = "Hello world!"
}