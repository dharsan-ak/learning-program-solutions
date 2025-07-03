import org.junit.Test;
import static org.junit.Assert.*;

public class Calculatortest {

    @Test
    public void testAddition() {
        int result = 2 + 3;
        assertEquals(5, result);
    }
    
    @Test
    public void testSubtraction() {
        int result = 5 - 2;
        assertEquals(3, result);
    }

    @Test
    public void testMultiplication() {
        int result = 4 * 3;
        assertEquals(12, result);
    }

    @Test
    public void testDivision() {
        int result = 10 / 2;
        assertEquals(5, result);
    }

}
