package com.example.demokotlin.service

import com.example.demokotlin.repository.MemoRepository
import org.springframework.stereotype.Service


@Service
class MemoServiceImpl(private val repository: MemoRepository): MemoService {
    override fun findById(id: Long) = repository.findOne(id)
}