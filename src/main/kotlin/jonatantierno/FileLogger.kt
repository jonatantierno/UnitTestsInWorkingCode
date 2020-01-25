package jonatantierno

import java.time.format.DateTimeFormatter

class FileLogger(private val storage: Storage, private val clock: Clock) {
    constructor(file: String): this(FileStorage(file), RealClock)

    private val formatter: DateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

    fun log(level: Level, message: String) {
        storage.store("${clock.now().format(formatter)} - $level - $message\n")
    }

}

enum class Level {DEBUG, INFO, ERROR}
