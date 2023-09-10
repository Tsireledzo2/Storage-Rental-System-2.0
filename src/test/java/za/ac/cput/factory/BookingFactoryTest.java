//package za.ac.cput.factory;
//
//
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Timeout;
//import za.ac.cput.domain.Booking;
//import java.util.Date;
//import java.util.concurrent.TimeUnit;
//import static org.junit.jupiter.api.Assertions.*;
//
//class BookingFactoryTest {
//
//    @Test
//    public void testObjectEquality() {
//        Booking booking1 = new Booking(new Date(2025, 3, 8)
//                ,new Date(2025, 12, 8)
//                ,new Date(2023, 6, 8)
//                ,true,25);
//
//        Booking booking2 = new Booking(new Date(2025, 3, 8)
//                ,new Date(2025, 12, 8)
//                ,new Date(2023, 6, 8)
//                ,true,25);
//        assertEquals(booking1,booking2,"Test Passed");
//    }
//
//    @Test
//    public void testObjectIdentity() {
//
//        Booking booking2 = new Booking(new Date(2023, 3, 8)
//                ,new Date(2025, 1, 8)
//                ,new Date(2024, 6, 8)
//                ,false,27);
//
//        Booking booking1 = new Booking(new Date(2023, 3, 8)
//                ,new Date(2023, 12, 8)
//                ,new Date(2023, 6, 8)
//                ,true,25);
//
//        assertNotSame(booking1 , booking2,"ObjectIdentity Test Passed");
//    }
//
//    @Test
//    public void testObjectFailing() {
//
//        Booking booking2 = new Booking(new Date(2023, 6, 8)
//                ,new Date(2023, 12, 8)
//                ,new Date(2023, 6, 8)
//                ,true,25);
//
//        Booking booking1 = new Booking(new Date(2023, 3, 8)
//                ,new Date(2023, 12, 8)
//                ,new Date(2023, 6, 8)
//                ,true,25);
//
//        assertNotEquals(booking1 , booking2,"Test Passed");
//    }
//
//    @Test
//    @Timeout(value = 1000 ,unit = TimeUnit.MILLISECONDS)
//    public void testTimeout() {
//        Booking booking2 = new Booking(new Date(2023, 3, 8)
//                ,new Date(2023, 12, 8)
//                ,new Date(2023, 6, 8)
//                ,true,25);
//
//        Booking booking1 = new Booking(new Date(2023, 3, 8)
//                ,new Date(2023, 12, 8)
//                ,new Date(2023, 6, 8)
//                ,true,25);
//
//        assertEquals(booking1 , booking2,"Test Passed");
//    }
//
//    @Test
//    @Disabled
//    public void testDisabling() {
//        Booking booking2 = new Booking(new Date(2023, 3, 8)
//                ,new Date(2023, 12, 8)
//                ,new Date(2023, 6, 8)
//                ,true,25);
//
//        Booking booking1 = new Booking(new Date(2023, 3, 8)
//                ,new Date(2023, 12, 8)
//                ,new Date(2023, 6, 8)
//                ,true,25);
//
//        assertEquals(booking1 , booking2,"Test Passed");
//    }
//}