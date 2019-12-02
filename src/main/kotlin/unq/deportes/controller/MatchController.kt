package unq.deportes.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import unq.deportes.model.Match
import unq.deportes.repository.MatchRepository


@RestController
@RequestMapping("/api/matches")
class MatchController {

    @Autowired
    lateinit var repository: MatchRepository

    @GetMapping
    @Throws(Exception::class)
    fun findAll(): ResponseEntity<List<Match>>{
        var response: List<Match>
        try {
            response = this.lastMatches(repository.findAll().toList())
        } catch (e: Exception) {
            return ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR)
        }
        return ResponseEntity(response, HttpStatus.OK)
    }

    fun lastMatches(matches:List<Match>): MutableList<Match> {
        var counter = 0
        var matchesCopy: MutableList<Match> = matches as MutableList<Match>
        var lastMatches = mutableListOf<Match> ()
        while (counter < 10){
            lastMatches.add(matchesCopy.last())
            counter += 1
            matchesCopy.remove(matchesCopy.last())
        }

        return lastMatches
    }


}