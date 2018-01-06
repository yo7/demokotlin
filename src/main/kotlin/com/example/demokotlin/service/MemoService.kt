package com.example.demokotlin.service

import com.example.demokotlin.entity.Memo

interface MemoService {
    fun findById(id: Long): Memo?
}