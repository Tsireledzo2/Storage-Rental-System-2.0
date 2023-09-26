package za.ac.cput.repository;

/*
 * Booking.java
 * Booking Entity
 * @author: Argus Hakizimana Mbogo
 * Student N.o 220073260
 * Date: 07 April 2023
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Booking;

import java.awt.*;
import java.util.List;
@Repository
public interface IBookingRepository extends JpaRepository<Booking, Long> {
//Went from String to Long just uncomment for your code to run if you want to change my code please tell me so i know what to change
    @Query("SELECT b FROM Booking b WHERE b.collection = true")
    public List<Booking> getBookingsWithCollection();
}
