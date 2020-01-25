package jonatantierno.dmz

import jonatantierno.happyzone.Storage
import java.io.File

class FileStorage(private val fileName: String): Storage {
    override fun store(text: String) {
        File(fileName).appendText(text)
    }
}
