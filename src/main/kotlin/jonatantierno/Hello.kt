package jonatantierno

import jonatantierno.dmz.FileLogger
import jonatantierno.happyzone.Level

fun main(args: Array<String>) {
    val logger = FileLogger("log.txt")

    logger.log(Level.INFO, "Hello World");
}

