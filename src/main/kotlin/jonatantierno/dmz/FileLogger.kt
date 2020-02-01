package jonatantierno.dmz

import jonatantierno.happyzone.Logger

class FileLogger(fileName: String): Logger(FileStorage(fileName), RealClock)
