package kr.ac.kumoh.s20211086.w24CardBackend.controller

import kr.ac.kumoh.s20211086.w24CardBackend.model.Games
import kr.ac.kumoh.s20211086.w24CardBackend.service.GamesService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/card/games")
@CrossOrigin(origins = ["http://localhost:3000"])
class GamesController(private val service: GamesService)
{
    @GetMapping
    fun getGames(): List<Games> = service.getAllGames()
}