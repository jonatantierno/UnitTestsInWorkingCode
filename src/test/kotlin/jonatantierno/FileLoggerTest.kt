package jonatantierno

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.Test
import java.time.LocalDateTime
import kotlin.test.assertEquals

class FileLoggerTest {
    @Test
    fun happySimpleCase() {
        val clock = mockk<Clock>()
        every { clock.now() } returns LocalDateTime.parse("2007-12-03T10:15:30")
        val storage = mockk<Storage>(relaxed = true)

        val logger = FileLogger(storage, clock);

        logger.log(Level.ERROR, "hola")

        verify{ storage.store("2007-12-03T10:15:30 - ERROR - hola\n") }
    }
}
