package jonatantierno

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.Test
import java.time.Clock
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import kotlin.test.assertEquals

class FileLoggerTest {
    val clock = mockk<jonatantierno.Clock>()
    val store = mockk<Store>(relaxed = true)

    @Test
    fun logTest() {
        every { clock.now() } returns LocalDateTime.now( Clock.fixed( Instant.EPOCH, ZoneId.systemDefault() ) );

        FileLogger(clock, store).log("Hello")

        verify { store.write("1970-01-01T01:00:00 - Hello")}
    }
}
