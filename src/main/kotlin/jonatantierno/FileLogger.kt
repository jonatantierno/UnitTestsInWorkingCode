package jonatantierno

import java.io.File
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class FileLogger(private val fileName: String) {
    private val formatter: DateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

    fun log(message: String) {
        File(fileName).appendText(log(LocalDateTime.now(), message));
    }

    fun log(now: LocalDateTime, message: String): String {
        val time = now.format(formatter);
        return "$time - $message"
    }
}
