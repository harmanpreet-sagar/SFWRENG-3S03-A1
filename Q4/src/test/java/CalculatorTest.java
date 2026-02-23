import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test suite for Calculator divide() method
 * Following TDD principles - Test Driven Development
 */
public class CalculatorTest {
    
    private Calculator calculator;
    
    @Before
    public void setUp() {
        calculator = new Calculator();
    }
    
    /**
     * @author Harmanpreet Singh Sagar
     * Test 1: Division of two positive integers
     * Q4a - Basic functionality
     */
    @Test
    public void testDividePositiveNumbers() {
        double result = calculator.divide(10, 2);
        assertEquals(5.0, result, 0.0001);
    }
    
    /**
     * @author Harmanpreet Singh Sagar
     * Test 2: Division by zero should throw ArithmeticException
     * Q4a - Error handling
     */
    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        calculator.divide(10, 0);
    }
    
    /**
     * @author Colin Chambachan
     * Test 3: Irrational numbers rounded to 4 decimal places
     * 10/3 = 3.333333... should be rounded to 3.3333 exactly
     */
    @Test
    public void testIrrationalNumberRoundedTo4Decimals() {
        double result = calculator.divide(10, 3);
        assertEquals(3.3333, result, 0.0); 
    }

    /**
     * @author Colin Chambachan
     * Test 4: Rounding should be HALF_UP at 4 decimals
     * 1/6 = 0.166666... should round to 0.1667 (not 0.1666)
     */
    @Test
    public void testRoundingHalfUpAt4Decimals() {
        double result = calculator.divide(1, 6);
        assertEquals(0.1667, result, 0.0); 
    }

    /**
     * @author Colin Chambachan
     * Test 5: Integer.MIN_VALUE divided by -1 should throw (overflow-style safety rule)
     * Mathematical result is 2147483648 which is outside 32-bit signed int range
     */
    @Test(expected = ArithmeticException.class)
    public void testMinValueDivideByNegativeOneThrows() {
        calculator.divide(Integer.MIN_VALUE, -1); 
    }

}
