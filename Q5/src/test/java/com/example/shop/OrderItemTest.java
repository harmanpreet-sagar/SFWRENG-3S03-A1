package com.example.shop;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * AI-Generated test suite for OrderItem
 * SFWR ENG 3S03 A1 Q5 part a)
 */
public class OrderItemTest {

    /**
     * @author Colin Chambachan
     * Test 1: Valid OrderItem creation and getTotalPrice
     * quantity * unitPrice should return correct total
     */
    @Test
    public void testGetTotalPrice() {
        OrderItem item = new OrderItem("Widget", 3, 10.00);
        assertEquals(30.00, item.getTotalPrice(), 0.0001);
    }

    /**
     * @author Colin Chambachan
     * Test 2: Zero quantity should throw IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void testZeroQuantityThrows() {
        new OrderItem("Widget", 0, 10.00);
    }

    /**
     * @author Colin Chambachan
     * Test 3: getQuantity returns correct value
     */
    @Test
    public void testGetQuantity() {
        OrderItem item = new OrderItem("Widget", 5, 10.00);
        assertEquals(5, item.getQuantity());
    }

    /**
     * @author Jinwoo Hong
     * Test 4: Negative unit price should throw IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeUnitPriceThrows() {
        new OrderItem("Widget", 1, -0.01);
    }
}
