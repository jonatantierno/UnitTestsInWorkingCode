package jonatantierno

import jonatantierno.happyzone.FileLogger
import jonatantierno.infrastructure.FileStore
import jonatantierno.infrastructure.RealClock

fun main(args: Array<String>) {
    val logger = FileLogger(RealClock(), FileStore("log.txt"))

    logger.log("Hello World");
}

