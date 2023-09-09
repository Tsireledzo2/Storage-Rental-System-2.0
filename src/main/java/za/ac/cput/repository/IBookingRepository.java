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
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Booking;

import java.util.List;
@Repository
public interface IBookingRepository extends JpaRepository<Booking, String> {


   // Set<Booking> getAll();

    @Query("SELECT b FROM Booking b WHERE b.collection = true")
    public List<Booking> getBookingsWithCollection();
}
