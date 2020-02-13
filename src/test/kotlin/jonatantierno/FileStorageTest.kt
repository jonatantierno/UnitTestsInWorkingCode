package jonatantierno

import jonatantierno.dmz.FileStorage
import jonatantierno.happyzone.Storage
import java.io.File

class FileStorageTest: StorageContractTest() {
    override fun getEmptyStorage(): Storage {
        File("log.txt").writeText("")
        return FileStorage("log.txt")
    }
}
