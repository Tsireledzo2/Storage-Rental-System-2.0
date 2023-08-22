package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Booking;
import za.ac.cput.service.impl.BookingServiceImpl;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private BookingServiceImpl bookingService;

    @PostMapping("/create")
    public Booking create(@RequestBody Booking booking) {
        return bookingService.create(booking);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id) {
        return bookingService.delete(id);
    }

    @GetMapping("/getAll")
    public Iterable<Booking> getAll() {
        return bookingService.getAll();
    }


}
