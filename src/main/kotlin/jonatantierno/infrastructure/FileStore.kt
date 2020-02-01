package jonatantierno.infrastructure

import jonatantierno.happyzone.Store
import java.io.File

class FileStore(private val fileName: String): Store {
    override fun write(text: String) = File(fileName).appendText(text)
}
