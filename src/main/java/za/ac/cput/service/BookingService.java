package za.ac.cput.service;
/*
 * BookingService.java
 * BookingService Entity
 * @author: Argus Hakizimana Mbogo (220073260)
 * Date: 09 June 2023
 */

import za.ac.cput.domain.Booking;

import java.util.List;


public interface BookingService extends IService <Booking, Long> {
    Booking create(Booking booking);

//    Booking update(Booking booking);

    boolean delete(Long id); //Went from String to Long


    List<Booking> getAll();
}
