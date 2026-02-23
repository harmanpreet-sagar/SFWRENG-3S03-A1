package com.example.shop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * AI-Generated test suite for OrderService
 * SFWR ENG 3S03 A1 Q5 part b)
 */
public class OrderServiceTest {

    private OrderService orderService;

    @Before
    public void setUp() {
        orderService = new OrderService();
    }

    /**
     * @author Jinwoo Hong
     * Test 1: Valid payment should process and mark order paid.
     */
    @Test
    public void testProcessOrderWithValidPaymentSetsPaidAndReturnsTotal() {
        Order order = new Order();
        order.addItem(new OrderItem("Notebook", 2, 50.00));

        double total = orderService.processOrder(order, "STUDENT10", "card");

        assertEquals(OrderStatus.PAID, order.getStatus());
        assertEquals(108.00, total, 0.0001);
    }

    /**
     * @author Jinwoo Hong
     * Test 2: Invalid payment should cancel order and return zero.
     */
    @Test
    public void testProcessOrderWithInvalidPaymentCancelsOrder() {
        Order order = new Order();
        order.addItem(new OrderItem("Notebook", 1, 100.00));

        double total = orderService.processOrder(order, null, "crypto");

        assertEquals(OrderStatus.CANCELLED, order.getStatus());
        assertEquals(0.00, total, 0.0001);
    }

    /**
     * @author Jinwoo Hong
     * Test 3: Unsupported payment method should throw.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testProcessOrderWithUnknownPaymentMethodThrows() {
        Order order = new Order();
        order.addItem(new OrderItem("Notebook", 1, 100.00));

        orderService.processOrder(order, null, "cash");
    }
}
