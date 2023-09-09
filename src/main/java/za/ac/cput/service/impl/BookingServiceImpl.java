package za.ac.cput.service.impl;

/*
 * BookingServiceImpl.java
 * BookingServiceImpl Entity
 * @author: Argus Hakizimana Mbogo (220073260)
 * Date: 09 June 2023
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Booking;
import za.ac.cput.repository.IBookingRepository;
import za.ac.cput.service.BookingService;
import java.util.List;


@Service
public class BookingServiceImpl implements BookingService {

    private final IBookingRepository repository;

    @Autowired
    public BookingServiceImpl (IBookingRepository repository) {
        this.repository = repository;
    }


    @Override
    public Booking create(Booking booking) {
        return this.repository.save(booking);
    }

    @Override
    public Booking read(String id) {
        return this.repository.findById(id).orElse(null);
    }

    @Override
    public Booking update(Booking booking) {
        return this.repository.save(booking);
    }

    @Override
    public boolean delete(String id) {
        if(this.repository.existsById(id)) {
            this.repository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<Booking> getAll() {
        return repository.findAll();
    }
}
