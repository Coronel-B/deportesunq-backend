package unq.deportes

import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import unq.deportes.controller.BaseTestController

@SpringBootTest
class BaseTestControllerTest {

    @Autowired
    lateinit var baseTestController: BaseTestController


    @Test
    fun `WHEN The table is empty THEN findAll() SHOULD return an empty collection`() {
        val result = baseTestController.findAll()
        assertNull(result.firstOrNull())
    }


    @Test
    fun `WHEN the table is not empty THEN findAll() SHOULD return a non-empty collection`(){
        baseTestController.save("Test", "TestApe")
        val result = baseTestController.findAll()
        assertNotNull(result.firstOrNull())
    }

}