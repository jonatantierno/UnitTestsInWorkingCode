package jonatantierno.dmz

import jonatantierno.happyzone.Clock
import java.time.LocalDateTime

object RealClock: Clock {
    override fun now(): LocalDateTime = LocalDateTime.now();
}
