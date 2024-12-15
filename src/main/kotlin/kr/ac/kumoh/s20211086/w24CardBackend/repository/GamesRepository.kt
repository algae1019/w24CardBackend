package kr.ac.kumoh.s20211086.w24CardBackend.repository

import kr.ac.kumoh.s20211086.w24CardBackend.model.Games
import org.springframework.data.mongodb.repository.MongoRepository

interface GamesRepository: MongoRepository<Games, String>
{
    fun findByName(name: String): List<Games>
}