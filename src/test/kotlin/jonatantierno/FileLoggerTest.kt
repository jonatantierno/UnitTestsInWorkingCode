package jonatantierno

import org.junit.Test
import kotlin.test.assertEquals

class FileLoggerTest {
    @Test
    public fun formatTest() {
        assertEquals("123.456.789 - Hello\n", FileLogger("").format("123.456.789", "Hello"))
    }
}
