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
}
