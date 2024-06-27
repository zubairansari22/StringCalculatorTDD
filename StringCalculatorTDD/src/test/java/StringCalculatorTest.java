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
    @Test
    public void testMultipleNumbers() {
        assertEquals(6, StringCalculator.add("1,2,3"));
        assertEquals(60, StringCalculator.add("10,20,30"));
    }
    @Test
    public void testNewLineDelimiters() {
        assertEquals(6, StringCalculator.add("1\n2,3"));
        assertEquals(15, StringCalculator.add("4\n5\n6"));
    }
    @Test
    public void testDifferentDelimiters() {
        assertEquals(3, StringCalculator.add("//;\n1;2"));
        assertEquals(6, StringCalculator.add("//|\n1|2|3"));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeNumbers() {
        try {
            StringCalculator.add("1,-2,3");
        } catch (IllegalArgumentException e) {
            assertEquals("Negative numbers not allowed: -2", e.getMessage());
            throw e;
        }
        
        try {
            StringCalculator.add("1,-2,-3");
        } catch (IllegalArgumentException e) {
            assertEquals("Negative numbers not allowed: -2,-3", e.getMessage());
            throw e;
        }
    }

}
