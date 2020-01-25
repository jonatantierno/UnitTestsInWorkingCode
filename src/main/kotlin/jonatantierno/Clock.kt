package jonatantierno

import java.time.LocalDateTime

interface Clock {
    fun now(): LocalDateTime;
}

object RealClock: Clock{
    override fun now(): LocalDateTime = LocalDateTime.now();
}
