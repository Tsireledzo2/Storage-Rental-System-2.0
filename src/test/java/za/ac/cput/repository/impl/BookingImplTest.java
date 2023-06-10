package za.ac.cput.repository.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Booking;
import za.ac.cput.factory.BookingFactory;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BookingImplTest {

    private static BookingImpl repository = BookingImpl.getRepository();

    // Date date = new Date();

    private static Booking booking = BookingFactory.createBooking(new Date(2023, 3, 8),new Date(2023, 12, 8),new Date(2023, 6, 8),true,25);

    @Test
    @Order(1)
    void create() {
        Booking created = repository.create(booking);
        assertNotNull(created);
        assertEquals(booking.getBookingNumber() , created.getBookingNumber());
        System.out.println("Create" + created);
    }

    @Test
    @Order(2)
    void read() {
        Booking reading = repository.read(booking.getBookingNumber());
        assertNotNull(reading);
        System.out.println("Read"+ reading);
    }

    @Test
    @Order(3)
    void update() {
        Booking updated = new Booking.Builder().copy(booking)
                .setBookingDate(new Date(2023, 3, 8))
                .setStartDate(new Date(2023, 12, 8))
                .setEndDate(new Date(2023, 6, 8))
                .setTotalAmount(25)
                .setCollection(true)
                .build();
        assertNotNull(repository.update(updated));
    }

    @Test
    @Order(5)
    void delete() {
        boolean deleted = repository.delete(booking.getBookingNumber());
        assertTrue(deleted);
        System.out.println("Deleted" + deleted);
    }

    @Test
    @Order(4)
    void getAll() {
        System.out.println("Show all");
        System.out.println(repository.getAll());
    }
}