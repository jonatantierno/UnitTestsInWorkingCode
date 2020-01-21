package jonatantierno

import java.time.LocalDateTime

interface Clock {
    fun now(): LocalDateTime
}

class RealClock: Clock {
    override fun now(): LocalDateTime {
        return LocalDateTime.now();
    }
}
