package za.ac.cput.service;

import za.ac.cput.domain.Booking;

import java.util.Set;

public interface BookingService {
    Booking create(Booking booking);

    boolean delete(String id);

    Set<Booking> getAll();
}
