package jonatantierno.infrastructure

import jonatantierno.happyzone.Clock
import java.time.LocalDateTime

class RealClock: Clock {
    override fun now(): LocalDateTime {
        return LocalDateTime.now();
    }
}
