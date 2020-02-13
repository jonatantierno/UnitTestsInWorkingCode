package jonatantierno

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import jonatantierno.happyzone.Clock
import jonatantierno.happyzone.ErrorLevel
import jonatantierno.happyzone.Logger
import jonatantierno.happyzone.Storage
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import kotlin.test.Test

class FileLoggerTest {
    val clock = mockk<Clock>()
    val storage = mockk<Storage>(relaxed = true)

    @Test
    fun happyTest(){
        every { clock.now() } returns LocalDateTime.ofInstant(Instant.EPOCH, ZoneId.systemDefault())
        val text = Logger(clock, storage).log(ErrorLevel.INFO, "hola")

        verify { storage.store("1970-01-01T01:00:00 - [INFO] hola\n") }
    }
}
