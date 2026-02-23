import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Simple Calculator class
 * TDD: Q4b - Basic implementation until tests pass
 * TDD: Q4f - Improving functionality so tests pass after improving the test suite
 */
public class Calculator {
    
    /**
     * @author Harmanpreet Singh Sagar, Jinwoo Hong
     * Divides two numbers
     * @param dividend the number to be divided
     * @param divisor the number to divide by
     * @return the result of division
     * @throws ArithmeticException if divisor is zero
     */
    public double divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            throw new ArithmeticException("Integer overflow");
        }
        return BigDecimal.valueOf(dividend).divide(BigDecimal.valueOf(divisor), 4, RoundingMode.HALF_UP).doubleValue();
    }
}
