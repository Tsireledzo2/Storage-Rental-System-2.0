package za.ac.cput.repository.impl;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Checkin;
import za.ac.cput.domain.Checkout;
import za.ac.cput.factory.CheckinFactory;
import za.ac.cput.factory.CheckoutFactory;

import static org.junit.jupiter.api.Assertions.*;

class CheckoutImplTest {

    private static final CheckoutImpl repository = CheckoutImpl.getCheckOutRepository();

    private static final Checkout checkout = CheckoutFactory.createCheckout("in", "out");

    @Test
    @Order(1)
    void create() {
        Checkout created = repository.create(checkout);
        assertNotNull(created);
        assertEquals(checkout.getDriverStatus() , created.getDriverStatus());
        System.out.println("Create: " + created);
    }

    @Test
    @Order(2)
    void read() {
        Checkout reading = repository.read(checkout.getDriverStatus());
        assertNotNull(reading);
        System.out.println("Read: "+ reading);
    }

    @Test
    @Order(3)
    void update() {
        Checkout updated = new Checkout.Builder().copy(checkout)
                .setDriverStatus("out")
                .setVehicleStatus("in")
                .build();
        assertNull(repository.update(updated));
        System.out.println("Not null: " + updated);
    }

    @Test
    @Order(5)
    void delete() {
        boolean deleted = repository.delete(checkout.getDriverStatus());
        assertTrue(deleted);
        System.out.println("Deleted: " + deleted);
    }

    @Test
    @Order(4)
    void getAll() {
        System.out.println("Show all: "+ repository.getAll());

    }
}