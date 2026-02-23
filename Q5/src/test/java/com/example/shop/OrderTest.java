package com.example.shop;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * AI-Generated test suite for Order
 * SFWR ENG 3S03 A1 Q5 part a)
 */
public class OrderTest {

    private Order order;

    @Before
    public void setUp() {
        order = new Order();
    }

    /**
     * @author Colin Chambachan
     * Test 1: Newly created order should have CREATED status
     */
    @Test
    public void testInitialStatusIsCreated() {
        assertEquals(OrderStatus.CREATED, order.getStatus());
    }

    /**
     * @author Colin Chambachan
     * Test 2: Newly created order should have empty items list
     */
    @Test
    public void testInitialItemsEmpty() {
        assertTrue(order.getItems().isEmpty());
    }

    /**
     * @author Colin Chambachan
     * Test 3: Adding an item increases items list size
     */
    @Test
    public void testAddItem() {
        order.addItem(new OrderItem("Widget", 1, 10.00));
        assertEquals(1, order.getItems().size());
    }

    /**
     * @author Jinwoo Hong
     * Test 4: Adding an item after processing should throw.
     */
    @Test(expected = IllegalStateException.class)
    public void testAddItemAfterOrderProcessedThrows() {
        order.setStatus(OrderStatus.PAID);
        order.addItem(new OrderItem("Widget", 1, 10.00));
    }
}
