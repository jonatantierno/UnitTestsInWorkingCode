package jonatantierno.happyzone

import java.time.LocalDateTime

interface Clock {
    fun now(): LocalDateTime
}
