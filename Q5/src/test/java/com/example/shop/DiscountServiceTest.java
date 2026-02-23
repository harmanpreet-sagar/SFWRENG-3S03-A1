package com.example.shop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * AI-Generated test suite for DiscountService
 * SFWR ENG 3S03 A1 Q5 part b)
 */
public class DiscountServiceTest {

    private DiscountService discountService;

    @Before
    public void setUp() {
        discountService = new DiscountService();
    }

    /**
     * @author Jinwoo Hong
     * Test 1: Null discount code leaves subtotal unchanged.
     */
    @Test
    public void testNullDiscountCodeReturnsSubtotal() {
        assertEquals(100.00, discountService.applyDiscount(100.00, null), 0.0001);
    }

    /**
     * @author Jinwoo Hong
     * Test 2: Blank discount code leaves subtotal unchanged.
     */
    @Test
    public void testBlankDiscountCodeReturnsSubtotal() {
        assertEquals(100.00, discountService.applyDiscount(100.00, "   "), 0.0001);
    }

    /**
     * @author Jinwoo Hong
     * Test 3: STUDENT10 applies 10% discount.
     */
    @Test
    public void testStudent10DiscountApplied() {
        assertEquals(90.00, discountService.applyDiscount(100.00, "STUDENT10"), 0.0001);
    }

    /**
     * @author Jinwoo Hong
     * Test 4: BLACKFRIDAY applies 30% discount.
     */
    @Test
    public void testBlackFridayDiscountApplied() {
        assertEquals(70.00, discountService.applyDiscount(100.00, "BLACKFRIDAY"), 0.0001);
    }

}
