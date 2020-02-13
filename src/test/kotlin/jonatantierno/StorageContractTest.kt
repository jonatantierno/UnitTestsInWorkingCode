package jonatantierno

import jonatantierno.happyzone.Storage
import org.junit.Test
import kotlin.test.assertEquals

abstract class StorageContractTest {
    @Test
    fun shouldBeEmpty(){
        val storage = getEmptyStorage()

        assertEquals("", storage.getAll())
    }

    @Test
    fun shouldGetContents(){
        val storage = getEmptyStorage()

        storage.store("hello")
        storage.store("world")
        assertEquals("helloworld", storage.getAll())
    }

    abstract fun getEmptyStorage(): Storage;
}

