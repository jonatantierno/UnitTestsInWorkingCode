package jonatantierno.dmz

import jonatantierno.happyzone.Logger

class FileLogger(fileName: String): Logger(
    RealClock,
    FileStorage(fileName)
)
