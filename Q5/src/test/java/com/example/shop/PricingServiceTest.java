package com.example.shop;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * AI-Generated test suite for PricingService
 * SFWR ENG 3S03 A1 Q5 part a)
 */
public class PricingServiceTest {

    private PricingService pricingService;

    @Before
    public void setUp() {
        pricingService = new PricingService();
    }

    /**
     * @author Colin Chambachan
     * Test 1: Subtotal of a single item order
     */
    @Test
    public void testCalculateSubtotalSingleItem() {
        Order order = new Order();
        order.addItem(new OrderItem("Widget", 2, 15.00));
        assertEquals(30.00, pricingService.calculateSubtotal(order), 0.0001);
    }

    /**
     * @author Colin Chambachan
     * Test 2: Subtotal of empty order is zero
     */
    @Test
    public void testCalculateSubtotalEmptyOrder() {
        Order order = new Order();
        assertEquals(0.00, pricingService.calculateSubtotal(order), 0.0001);
    }

    /**
     * @author Colin Chambachan
     * Test 3: Tax at 20% on a positive subtotal
     */
    @Test
    public void testCalculateTaxPositiveSubtotal() {
        assertEquals(20.00, pricingService.calculateTax(100.00), 0.0001);
    }

    /**
     * @author Jinwoo Hong
     * Test 4: Tax on zero subtotal should be zero.
     */
    @Test
    public void testCalculateTaxZeroSubtotal() {
        assertEquals(0.00, pricingService.calculateTax(0.00), 0.0001);
    }

    /**
     * @author Jinwoo Hong
     * Test 5: Negative subtotal should throw.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCalculateTaxNegativeSubtotalThrows() {
        pricingService.calculateTax(-1.00);
    }
}
