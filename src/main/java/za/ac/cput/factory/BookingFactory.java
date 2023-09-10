package za.ac.cput.factory;

/*
 * BookingFactory.java
 * Entity for BookingFactory
 * @author: Argus Hakizimana Mbogo (220073260)
 * Date: 07 April 2023
 */

import za.ac.cput.domain.Booking;
import za.ac.cput.domain.Customer;
import za.ac.cput.domain.StorageUnit;
import za.ac.cput.util.Helper;

import java.util.Date;

public class BookingFactory {

    public static Booking createBooking(Date bookingDate, Date startDate, Date endDate, boolean collection, double totalAmount, Customer customer, StorageUnit storageUnit) {

        if (Helper.isNullorEmpty(bookingDate.toString()) || Helper.isNullorEmpty(startDate.toString())) {
            return null;
        }

        String bookingNum = Helper.generateId();

        Booking booking = new Booking.Builder()
                .setBookingNumber(Long.valueOf(bookingNum)) //Went from String to Long
                .setBookingDate(bookingDate)
                .setStartDate(startDate)
                .setEndDate(endDate)
                .setCollection(collection)
                .setTotalAmount(totalAmount)
                .setCustomer(customer)
                .setStorageUnit(storageUnit)
                .build();
        return booking;

    }
}
