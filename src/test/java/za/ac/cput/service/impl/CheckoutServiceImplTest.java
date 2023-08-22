package za.ac.cput.service.impl;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Checkout;
import za.ac.cput.factory.CheckoutFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CheckoutServiceImplTest {

    private static CheckoutServiceImpl service = CheckoutServiceImpl.getService();

    private static Checkout checkout = CheckoutFactory.createCheckout("in","out");

    public CheckoutServiceImplTest() {service = CheckoutServiceImpl.getService();}

    @Test
    void getService() {
    }

    @Test
    @Order(1)
    void create() {
        Checkout created = service.create(checkout);
        assertNotNull(created);
        System.out.println("Created" + created);
    }

    @Test
    @Order(2)
    void read() {
        Checkout read = service.read(checkout.getDriverStatus());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    @Order(3)
    void update() {
        Checkout update = service.update(checkout);
        assertNotNull(update);
        System.out.println("Update: " + update);

    }

    @Test
    @Order(5)
    void delete() {
        boolean deleted = service.delete(checkout.getDriverStatus());
        assertTrue(deleted);
        System.out.println("Deleted" + deleted);
    }

    @Test
    @Order(4)
    void getAll() {
        System.out.println("Get all: " + service.getAll());
    }
}