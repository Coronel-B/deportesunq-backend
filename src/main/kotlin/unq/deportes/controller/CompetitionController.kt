package unq.deportes.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import unq.deportes.model.Competition
import unq.deportes.model.CompetitionDetailItem
import unq.deportes.model.CompetitionDetails
import unq.deportes.model.TeamDetails
import unq.deportes.repository.CompetitionRepository


@RestController
@RequestMapping("/api/competitions")
class CompetitionController {

    @Autowired
    lateinit var repository: CompetitionRepository

    @GetMapping
    @Throws(Exception::class)
    fun findAll(): ResponseEntity<List<Competition>>{
        var response: ArrayList<Competition> = arrayListOf()
       /* try {
            response = repository.findAll().toList()
        } catch (e: Exception) {
            return ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR)
        }*/
        response.add(Competition(1, "Liga", 2019, "UTN Avellaneda"))
        response.add(Competition(2, "JUR", 2019, "UNDAV"))
        response.add(Competition(3, "Playoffs", 2019, "UNQ"))
        return ResponseEntity(response, HttpStatus.OK)
    }

    @GetMapping("/{id}")
    @Throws(Exception::class)
    fun findDetailsOfId(@PathVariable id: Long): ResponseEntity<CompetitionDetails>{
        var response: CompetitionDetails
        /*try {
            response = CompetitionDetails(id, repository.findDetailItemsOf(id))
        } catch (e: Exception) {
            return ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR)
        }*/
        val UTNAv = TeamDetails(1, "UTN Avellaneda", "UTN Avellaneda")
        val UNQ = TeamDetails(2, "UNQ", "Universidad Nacional de Quilmes")
        val UNDAV = TeamDetails(3, "UNDAV", "Universidad Nacional de Avellaneda")
        when(id){
            1L -> {
                var list: ArrayList<CompetitionDetailItem> = arrayListOf(CompetitionDetailItem(1, UTNAv),
                        CompetitionDetailItem(2, UNQ),
                        CompetitionDetailItem(3, UNDAV))
                response = CompetitionDetails(id, list)
            }
            2L ->{
                var list: ArrayList<CompetitionDetailItem> = arrayListOf( CompetitionDetailItem(1, UNDAV),
                        CompetitionDetailItem(2, UNQ),
                        CompetitionDetailItem(3, UTNAv))
                response = CompetitionDetails(id, list)
            }
            3L ->{
                var list: ArrayList<CompetitionDetailItem> = arrayListOf(CompetitionDetailItem(1, UNQ),
                        CompetitionDetailItem(2, UTNAv),
                        CompetitionDetailItem(3, UNDAV))
                response = CompetitionDetails(id, list)
            }
            else -> return ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR)
        }
        return ResponseEntity(response, HttpStatus.OK)
    }

    @PostMapping
    @Throws(Exception::class)
    fun save(@RequestParam(value = "name", defaultValue = "CompetitionTest") name: String,
             @RequestParam(value = "year", defaultValue = "2019") year: Int,
             @RequestParam(value = "champion", defaultValue = "UNQ") champion: String): ResponseEntity<HttpStatus>{
        try {
            repository.save(Competition(0, name, year, champion))
        } catch (e: Exception) {
            return ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR)
        }
        return ResponseEntity(HttpStatus.OK)
    }
}