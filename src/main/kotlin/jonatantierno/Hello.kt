package jonatantierno

fun main(args: Array<String>) {
    val logger = FileLogger("log.txt")

    logger.log(Level.INFO, "Hello World");
}

