package kr.ac.kumoh.s20211086.w24CardBackend.controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/message")
class MessageController
{
    @GetMapping
    // Todo
    @CrossOrigin(origins = ["http://localhost:3000"])
    fun getMessage() = mapOf("status" to "success")
}