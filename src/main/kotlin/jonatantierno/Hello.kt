package jonatantierno

import jonatantierno.dmz.FileStorage
import jonatantierno.dmz.RealClock
import jonatantierno.happyzone.FileLogger
import jonatantierno.happyzone.Level

fun main(args: Array<String>) {
    val logger = FileLogger(FileStorage("log.txt"), RealClock)

    logger.log(Level.INFO, "Hello World");
}

