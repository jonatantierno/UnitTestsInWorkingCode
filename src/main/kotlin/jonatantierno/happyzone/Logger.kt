package jonatantierno.happyzone

import java.time.format.DateTimeFormatter

open class Logger(private val clock: Clock, private val store: Store) {
    private val formatter: DateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

    fun log(message: String) = store.write("${clock.now().format(formatter)} - $message")
}
