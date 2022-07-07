import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class BinarySearchTest{
    private val testBinary: BinarySearch = BinarySearch(listOf())

    @Test
    fun testEquals(){
        val list = listOf(3,5,6,7,9,13,14,24,32,45,54,57)
        val expected = 32
        assertEquals(expected, testBinary.searchInt(list,32))
    }

    @Test
    fun testEqualsFailsWithValueLargeThanTheList(){
        val list = listOf(3,5,6,7,9,13,14,24,32,45,54,57)
        val expected = 32
        assertNotEquals(expected, testBinary.searchInt(list,60))
    }

    @Test
    fun testEqualsFailsWithValueIsLessThanTheList(){
        val list = listOf(23,25,36,37,49,53,64,74,82,85,94,107)
        val expected = 49
        assertNotEquals(expected, testBinary.searchInt(list,11))
    }
}