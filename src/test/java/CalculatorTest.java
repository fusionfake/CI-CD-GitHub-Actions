import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    public void setUp() {
        this.calc = new Calculator();
    }

    @Test
    public void testSum() {
        assertEquals(9, calc.sum(4,5));
    }

    @Test
    public void testSub() {
        assertEquals(-1, calc.sub(4,5));
    }

    @Test
    public void testMult() {
        assertEquals(16, calc.mult(4,4));
    }

    @Test
    public void testDiv() {
        assertEquals(2, calc.div(4,2));
    }

    @Test
    public void testSumAfterMult() {
        int multResult = calc.mult(4,5);
        assertEquals(24, calc.sum(4,multResult));
    }
}

