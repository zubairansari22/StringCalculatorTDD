import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculatorTest {
    @Test
    public void testEmptyString() {
        assertEquals(0, StringCalculator.add(""));
    }
    
    @Test
    public void testSingleNumber() {
        assertEquals(1, StringCalculator.add("1"));
        assertEquals(5, StringCalculator.add("5"));
    }
    @Test
    public void testTwoNumbers() {
        assertEquals(3, StringCalculator.add("1,2"));
        assertEquals(9, StringCalculator.add("4,5"));
    }
}
