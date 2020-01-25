package jonatantierno

import org.junit.Test
import java.time.LocalDateTime
import kotlin.test.assertEquals

class FileLoggerTest {
    @Test
    fun textShouldIncludeEndOfLine() {
        val logger = FileLogger("");

        assertEquals("20-20-2020 - ERROR - hola\n", logger.format(Level.ERROR, "20-20-2020", "hola"));
    }

    @Test
    fun happySimpleCase() {
        val logger = FileLogger("");

        val actual = logger.log(Level.ERROR, "hola", LocalDateTime.parse("2007-12-03T10:15:30"))
        assertEquals("2007-12-03T10:15:30 - ERROR - hola\n", actual);
    }
}
