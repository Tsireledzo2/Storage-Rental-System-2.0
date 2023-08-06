package za.ac.cput.repository;

/*
 * Booking.java
 * Booking Entity
 * @author: Argus Hakizimana Mbogo
 * Student N.o 220073260
 * Date: 07 April 2023
 */

import za.ac.cput.domain.Booking;

import java.util.Set;

public interface IBookingRepository extends IRepository<Booking, String> {

    Set<Booking> getAll();
}
