package com.example.demokotlin.entity

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters
import java.io.Serializable
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "memo")
data class Memo (
    @Column(name="title", nullable = false)
    var title: String = "",
    @Column(name="description", nullable = false)
    var description: String = "",
    @Column(name = "done", nullable = false)
    var done: Boolean = false,
    @Column(name = "updated")
    var updated: Date? = null,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
): Serializable