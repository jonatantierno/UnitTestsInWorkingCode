package jonatantierno.infrastructure

import jonatantierno.happyzone.Logger

class FileLogger(fileName: String): Logger(RealClock, FileStore(fileName))
