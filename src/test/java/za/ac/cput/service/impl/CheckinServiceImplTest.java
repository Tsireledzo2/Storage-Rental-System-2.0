package za.ac.cput.service.impl;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Checkin;
import za.ac.cput.domain.Checkout;
import za.ac.cput.factory.CheckinFactory;
import za.ac.cput.factory.CheckoutFactory;

import static org.junit.jupiter.api.Assertions.*;


class CheckinServiceImplTest {

    private static CheckinServiceImpl service = CheckinServiceImpl.getService();

    private static Checkin checkin = CheckinFactory.createCheckin("in","out");

    public CheckinServiceImplTest() {service = CheckinServiceImpl.getService();}

    @Test
    @Order(1)
    void create() {
        Checkin created = service.create(checkin);
        assertNotNull(created);
        System.out.println("Created" + created);
    }

    @Test
    @Order(2)
    void read() {
        Checkin read = service.read(checkin.getDriverStatus());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    @Order(3)
    void update() {
        Checkin update = service.update(checkin);
        assertNotNull(update);
        System.out.println("Update: " + update);

    }

    @Test
    @Order(5)
    void delete() {
        boolean deleted = service.delete(checkin.getDriverStatus());
        assertTrue(deleted);
        System.out.println("Deleted" + deleted);
    }

    @Test
    @Order(4)
    void getAll() {
        System.out.println("Get all: " + service.getAll());
    }
}