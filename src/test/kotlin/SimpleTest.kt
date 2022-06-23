import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SimpleTest {

    private val calculator = Calculator()

    @Test
    fun testSum() {
        assertEquals(6, calculator.sum(1, 5))
    }

    @Test
    fun testSub() {
        assertEquals(1, calculator.sub(5, 4))
    }
}