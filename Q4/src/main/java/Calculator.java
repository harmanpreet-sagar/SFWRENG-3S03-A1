package Q4.src.main.java;

/**
 * Simple Calculator class
 * TDD: Iteration 1 - Basic implementation (tests should pass)
 */
public class Calculator {
    
    /**
     * @author Harmanpreet Singh Sagar
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
        return (double) dividend / divisor;
    }
}
