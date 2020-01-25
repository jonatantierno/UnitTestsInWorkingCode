package jonatantierno

import java.io.File
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class FileLogger(private val fileName: String) {

    private val formatter: DateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

    fun log(message: String) {
        val time = LocalDateTime.now().format(formatter);
        File(fileName).appendText("$time - $message");
    }
}
