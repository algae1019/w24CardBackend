package kr.ac.kumoh.s20211086.w24CardBackend.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "games")
data class Games(
    @Id
    val id: String? = null,
    val name : String,
    val players : String,
    val numOfCards : String,
    val avgPlaytime : String,
    val goal : String,
    val image : String? = null
)
