package unq.deportes

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.HttpStatus
import unq.deportes.controller.CompetitionController

@SpringBootTest
class CompetitionTest {

    @Autowired
    lateinit var competitionController: CompetitionController

    @Test
    fun `WHEN findAll() is called SHOULD return a non-empty collection and OK httpstate`(){
        val result = competitionController.findAll()
        assertEquals(HttpStatus.OK, result.statusCode)
        assertNotNull(result.body?.firstOrNull())
    }

    @Test
    fun `WHEN findDetailsOfId() is called with an id THEN SHOULD return CompetitionDetails of the id and OK httpstate`(){
        val result = competitionController.findDetailsOfId(1)
        assertEquals(HttpStatus.OK, result.statusCode)
        assertEquals(1L, result.body?.getId())
    }

}