package Q4.src.test.java;

import Q4.src.main.java.Calculator;

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
}
