package jonatantierno

import org.junit.Test
import java.time.Clock
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import kotlin.test.assertEquals

class FileLoggerTest {

    @Test
    fun logTest() {
        val time = LocalDateTime.now( Clock.fixed( Instant.EPOCH, ZoneId.systemDefault() ) )
        assertEquals("1970-01-01T01:00:00 - Hello", FileLogger("").log(time, "Hello"))
    }
}
