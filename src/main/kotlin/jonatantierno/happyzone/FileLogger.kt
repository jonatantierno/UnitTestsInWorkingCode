package jonatantierno.happyzone

import java.time.format.DateTimeFormatter

class FileLogger(private val storage: Storage, private val clock: Clock) {

    private val formatter: DateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

    fun log(level: Level, message: String) {
        storage.store("${clock.now().format(formatter)} - $level - $message\n")
    }

}

enum class Level {DEBUG, INFO, ERROR}
