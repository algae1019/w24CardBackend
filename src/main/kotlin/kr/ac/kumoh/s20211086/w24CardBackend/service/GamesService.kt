package kr.ac.kumoh.s20211086.w24CardBackend.service

import kr.ac.kumoh.s20211086.w24CardBackend.model.Games
import kr.ac.kumoh.s20211086.w24CardBackend.repository.GamesRepository
import org.springframework.stereotype.Service

@Service
class GamesService(private val repository: GamesRepository)
{
    fun getAllGames(): List<Games> = repository.findAll()
}