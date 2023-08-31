//package za.ac.cput.service.impl;
//
//
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import za.ac.cput.domain.Booking;
//import za.ac.cput.factory.BookingFactory;
//import za.ac.cput.service.impl.BookingServiceImpl;
//
//import java.util.Date;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//class BookingServiceImplTest {
//
//    private static BookingServiceImpl service = BookingServiceImpl.getService();
//    private static final Booking booking = BookingFactory.createBooking(
//            new Date(2023, 3, 8)
//            , new Date(2023, 12, 8)
//            , new Date(2023, 6, 8), true, 25);
//
//    public BookingServiceImplTest() {
//        service = BookingServiceImpl.getService();
//    }
//
//    @Test
//    @Order(1)
//    void create() {
//        Booking created = service.create(booking);
//        assertNotNull(created);
//        System.out.println(created);
//    }
//
//
//
//    @Test
//    @Order(3)
//    void delete() {
//        boolean deleted = service.delete(booking.getBookingNumber());
//        assertTrue(deleted);
//        System.out.println(deleted);
//    }
//
//    @Test
//    @Order(2)
//    void getAll() {
//        System.out.println("Show All:" + service.getAll());
//
//    }
//}