package unq.deportes

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.jupiter.api.Test
import org.mockito.InjectMocks
import org.springframework.boot.test.context.SpringBootTest
import unq.deportes.controller.GreetingController

@SpringBootTest
class GreetingControllerTest {
    @InjectMocks
    lateinit var greetingController: GreetingController

	@Test
    fun greetingGetControllerTest() {
        val result = greetingController.greeting("Test")
        assertNotNull(result)
        assertEquals("Hello, Test!", result)
	}

}