package com.example.shop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * AI-Generated test suite for PaymentValidator
 * SFWR ENG 3S03 A1 Q5 part b)
 */
public class PaymentValidatorTest {

    private PaymentValidator paymentValidator;

    @Before
    public void setUp() {
        paymentValidator = new PaymentValidator();
    }

    /**
     * @author Jinwoo Hong
     * Test 1: Null payment method should be invalid.
     */
    @Test
    public void testNullPaymentMethodIsInvalid() {
        assertFalse(paymentValidator.isPaymentMethodValid(null));
    }

    /**
     * @author Jinwoo Hong
     * Test 2: Card payment method should be valid.
     */
    @Test
    public void testCardPaymentMethodIsValid() {
        assertTrue(paymentValidator.isPaymentMethodValid("card"));
    }

    /**
     * @author Jinwoo Hong
     * Test 3: PayPal payment method should be valid.
     */
    @Test
    public void testPaypalPaymentMethodIsValid() {
        assertTrue(paymentValidator.isPaymentMethodValid("paypal"));
    }

    /**
     * @author Jinwoo Hong
     * Test 4: Crypto payment method should be invalid.
     */
    @Test
    public void testCryptoPaymentMethodIsInvalid() {
        assertFalse(paymentValidator.isPaymentMethodValid("crypto"));
    }

    /**
     * @author Jinwoo Hong
     * Test 5: Unknown payment method should throw.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testUnknownPaymentMethodThrows() {
        paymentValidator.isPaymentMethodValid("bank-transfer");
    }
}
