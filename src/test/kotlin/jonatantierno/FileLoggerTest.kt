package jonatantierno

import org.junit.Test
import kotlin.test.assertEquals

class FileLoggerTest {
    @Test
    fun textShouldIncludeEndOfLine() {
        val logger = FileLogger("");

        assertEquals("20-20-2020 - hola\n", logger.format("20-20-2020", "hola"));
    }
}
