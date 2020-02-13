package jonatantierno

import jonatantierno.dmz.FileLogger
import jonatantierno.happyzone.ErrorLevel

fun main(args: Array<String>) {
    val logger = FileLogger("log.txt")

    logger.log(ErrorLevel.INFO, "Hello World");
}

