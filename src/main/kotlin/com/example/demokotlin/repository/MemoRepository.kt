package com.example.demokotlin.repository

import com.example.demokotlin.entity.Memo
import org.springframework.data.jpa.repository.JpaRepository

interface MemoRepository: JpaRepository<Memo, Long>