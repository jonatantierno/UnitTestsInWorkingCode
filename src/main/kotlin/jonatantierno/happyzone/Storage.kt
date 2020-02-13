package jonatantierno.happyzone

interface Storage {
    fun store(text: String)
    fun getAll(): String
}
