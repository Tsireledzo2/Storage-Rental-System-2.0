package za.ac.cput.controller;

/*
 * BookingController.java
 * Booking Entity
 * @author: Argus Hakizimana Mbogo (220073260)
 * Date: 15 June 2023
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Booking;
import za.ac.cput.domain.Driver;
import za.ac.cput.service.impl.BookingServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/booking")
//@CrossOrigin(origins = "http://localhost:8080")
public class BookingController {

    @Autowired
    private BookingServiceImpl bookingService;

    @PostMapping("/create")
    public Booking create(@RequestBody Booking booking) {
        return bookingService.create(booking);
    }


    @PostMapping("/update")
    public Booking update(@RequestBody Booking booking) {
        return bookingService.update(booking);
    }

    @GetMapping("/readBooking/{bookingNumber}")
    public Booking read(@PathVariable Long bookingNumber){
        return bookingService.read(bookingNumber);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable Long id) {

        return bookingService.delete(id);
    }

    @GetMapping("/getAll")
    public List<Booking> getAll() {
        return bookingService.getAll();
    }


    @GetMapping("/collections")
    public List<Booking> getCollections() {
        return bookingService.getBookingsWithCollections();
    }



}
