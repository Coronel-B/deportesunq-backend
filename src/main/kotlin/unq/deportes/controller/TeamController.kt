package unq.deportes.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import unq.deportes.model.Jugador
import unq.deportes.model.Team
import unq.deportes.repository.JugadorRepository
import unq.deportes.repository.TeamRepository


@RestController
@RequestMapping("/api/teams")
class TeamController {

    @Autowired
    lateinit var repository: TeamRepository
    @Autowired
    lateinit var jugadorRepository: JugadorRepository

    @GetMapping
    @Throws(Exception::class)
    fun findAll(): ResponseEntity<List<Team>>{
        var response: List<Team>
        try {
            response = repository.findAll().toList()
        } catch (e: Exception) {
            return ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR)
        }
        return ResponseEntity(response, HttpStatus.OK)
    }

    @GetMapping("/{id}")
    @Throws(Exception::class)
    fun findDetailsOfId(@PathVariable id: Long): ResponseEntity<List<Jugador>>{
        var response: List<Jugador>
        try {
            response = jugadorRepository.findByEquipo(Team(id, "", 0, "", "", ""))
        } catch (e: Exception) {
            return ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR)
        }

        return ResponseEntity(response, HttpStatus.OK)
    }

}