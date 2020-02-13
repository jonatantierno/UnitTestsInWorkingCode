package jonatantierno.happyzone

import jonatantierno.happyzone.Clock
import jonatantierno.happyzone.ErrorLevel
import jonatantierno.happyzone.Storage
import java.time.format.DateTimeFormatter

open class Logger(private val clock: Clock, private val storage: Storage) {

    private val formatter: DateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

    fun log(level: ErrorLevel, message: String) {
        storage.store("${clock.now().format(formatter)} - [$level] $message\n")
    }

}
