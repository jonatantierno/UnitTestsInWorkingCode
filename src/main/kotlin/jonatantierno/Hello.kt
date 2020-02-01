package jonatantierno

import jonatantierno.infrastructure.FileLogger

fun main(args: Array<String>) {
    val logger = FileLogger("log.txt")

    logger.log("Hello World");
}
