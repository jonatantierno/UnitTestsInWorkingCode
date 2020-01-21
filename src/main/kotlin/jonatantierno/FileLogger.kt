package jonatantierno

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class FileLogger(private val clock: Clock, private val store: Store) {
    constructor(fileName: String): this(RealClock(), FileStore(fileName))

    private val formatter: DateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

    fun log(message: String) {
        store.write(log(clock.now(), message));
    }

    fun log(now: LocalDateTime, message: String): String {
        val time = now.format(formatter);
        return "$time - $message"
    }
}
