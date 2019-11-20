package unq.deportes.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import unq.deportes.model.Competition
import unq.deportes.model.CompetitionDetails
import unq.deportes.repository.CompetitionRepository


@RestController
@RequestMapping("/api/competitions")
class CompetitionController {

    @Autowired
    lateinit var repository: CompetitionRepository

    @GetMapping
    @Throws(Exception::class)
    fun findAll(): ResponseEntity<List<Competition>>{
        var response: List<Competition>
        try {
            response = repository.findAll().toList()
        } catch (e: Exception) {
            return ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR)
        }
        return ResponseEntity(response, HttpStatus.OK)
    }

    @GetMapping("/{id}")
    @Throws(Exception::class)
    fun findDetailsOfId(@PathVariable id: Long): ResponseEntity<CompetitionDetails>{
        var response: CompetitionDetails
        try {
            response = CompetitionDetails(id, repository.findDetailItemsOf(id))
        } catch (e: Exception) {
            return ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR)
        }

        return ResponseEntity(response, HttpStatus.OK)
    }

}