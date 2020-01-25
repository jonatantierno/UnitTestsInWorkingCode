package jonatantierno

import java.io.File

interface Storage {
    fun store(text: String)
}

class FileStorage(private val fileName: String): Storage {
    override fun store(text: String) {
        File(fileName).appendText(text)
    }
}
