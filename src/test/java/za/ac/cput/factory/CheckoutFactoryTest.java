package za.ac.cput.factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.domain.Checkout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class CheckoutFactoryTest {

    @Test
    public void testObjectEquality() {
        Checkout checkout = new Checkout("in", "out");
        Checkout checkout1 = new Checkout("in", "out");

        assertNotSame(checkout, checkout1, "Test Passed");

    }

    @Test
    public void testObjectIdentity() {
        Checkout checkout = new Checkout("in","out");
        Checkout checkout2 = new Checkout("out","in");

        assertNotSame(checkout,checkout2,"Test Passed");

    }

    @Test
    public void testObjectFailing() {
        Checkout checkout = new Checkout("in","out");
        Checkout checkout2 = new Checkout("out","out");

        assertNotEquals(checkout,checkout2,"Test Passed");

    }

    @Test
    @Timeout(value = 1000 ,unit = TimeUnit.MILLISECONDS)
    public void testTimeout() {
        Checkout checkout = new Checkout("in","out");
        Checkout checkout2 = new Checkout("out","in");

        assertNotEquals(checkout,checkout2,"Test Passed");
    }

    @Test
    @Disabled
    public void testDisabling() {
        Checkout checkout = new Checkout("in","out");
        Checkout checkout2 = new Checkout("out","in");

        assertEquals(checkout,checkout2,"Test Passed");

    }
}