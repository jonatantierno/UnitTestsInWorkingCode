package jonatantierno

import java.io.File

interface Store {
    fun write(text: String)
}

class FileStore(private val fileName: String): Store {
    override fun write(text: String) {
        File(fileName).writeText(text)
    }
}
