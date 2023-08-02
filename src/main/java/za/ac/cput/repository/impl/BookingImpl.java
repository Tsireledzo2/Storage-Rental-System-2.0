package za.ac.cput.repository.impl;
/*
 * BookingImpl.java
 * BookingImpl Entity
 * @author: Argus Hakizimana Mbogo (220073260)
 * Date: 09 June 2023
 */

import za.ac.cput.domain.Booking;
import za.ac.cput.repository.IBookingRepository;

import java.util.HashSet;
import java.util.Set;

public class BookingImpl implements IBookingRepository {

    public static BookingImpl repository = null;

    public Set<Booking> bookingDataBase;

    public BookingImpl() {
        bookingDataBase = new HashSet<>();
    }

    public static BookingImpl getRepository() {
        return (repository == null) ? repository = new BookingImpl() : repository;
    }

    @Override
    public Booking create(Booking booking) {
       boolean added = bookingDataBase.add(booking);
       return (!added) ? null : booking;
    }

    @Override
    public Booking read(String id) {
        return bookingDataBase.stream()
                .filter(Book -> Book.getBookingNumber().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Booking update(Booking booking) {
        Booking oldBooking = read(booking.getBookingNumber());
        return (oldBooking != null) ? (bookingDataBase.remove(oldBooking)
                && bookingDataBase.add(booking)) ? booking:null: null;
    }

    @Override
    public boolean delete(String id) {
       Booking bookingToDelete = read(id);
       return bookingToDelete != null && (bookingDataBase.remove(bookingToDelete));
    }

    @Override
    public Set<Booking> getAll() {
        return bookingDataBase;
    }
}
