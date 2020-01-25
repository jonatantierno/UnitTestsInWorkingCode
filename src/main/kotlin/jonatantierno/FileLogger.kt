package jonatantierno

import java.io.File
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class FileLogger(private val fileName: String) {

    private val formatter: DateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

    fun log(level: Level, message: String) {
        File(fileName).appendText(log(level, message, LocalDateTime.now()))
    }
    fun log(level: Level, message: String, localDateTime: LocalDateTime): String =
        format(level, localDateTime.format(formatter), message)

    fun format(level: Level, time: String?, message: String) = "$time - $level - $message\n"
}

enum class Level {DEBUG, INFO, ERROR}
