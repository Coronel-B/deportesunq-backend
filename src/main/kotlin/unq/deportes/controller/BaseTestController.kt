package unq.deportes.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import unq.deportes.model.BaseTest
import unq.deportes.repository.BaseTestRepository

@RestController
class BaseTestController {

    @Autowired
    lateinit var repository: BaseTestRepository

    @PostMapping("/save")
    fun save(@RequestParam(value = "name", defaultValue = "NombreTest") name: String,
             @RequestParam(value = "lastName", defaultValue = "ApellidoTest") lastName: String){
        repository.save(BaseTest(name, lastName))
    }

    @GetMapping("/findall")
    fun findAll() = repository.findAll()

    @GetMapping("/findbyid/{id}")
    fun findById(@PathVariable id: Long)
            = repository.findById(id)

    @GetMapping("findbylastname/{lastName}")
    fun findByLastName(@PathVariable lastName: String)
            = repository.findByLastName(lastName)

}