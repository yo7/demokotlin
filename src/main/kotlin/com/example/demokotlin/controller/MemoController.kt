package com.example.demokotlin.controller

import com.example.demokotlin.entity.Memo
import com.example.demokotlin.service.MemoService
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path=["memo"])
class MemoController(private val service: MemoService) {
    @GetMapping(path = ["{id}"], produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun id(@PathVariable(value = "id") id: Long): ResponseEntity<Memo> {
        val memo = service.findById(id)
        return memo?.let { ResponseEntity.ok(memo) }
                ?: ResponseEntity(HttpStatus.NOT_FOUND)
    }
}