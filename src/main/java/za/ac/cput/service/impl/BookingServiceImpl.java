package za.ac.cput.service.impl;

/*
 * BookingServiceImpl.java
 * BookingServiceImpl Entity
 * @author: Argus Hakizimana Mbogo (220073260)
 * Date: 09 June 2023
 */

import org.springframework.stereotype.Service;
import za.ac.cput.domain.Booking;
import za.ac.cput.repository.IBookingRepository;
import za.ac.cput.repository.impl.BookingImpl;
import za.ac.cput.service.BookingService;
import java.util.Set;
@Service
public class BookingServiceImpl implements BookingService {

    private static BookingServiceImpl service = null;
    private final IBookingRepository repository ;

    private BookingServiceImpl() {
        repository = BookingImpl.getRepository();
    }

    public static BookingServiceImpl getService() {
        return (service == null) ? service = new BookingServiceImpl() : service;
    }


    @Override
    public Booking create(Booking booking) {
        return repository.create(booking);
    }

    @Override
    public boolean delete(String id) {
        return repository.delete(id);
    }

    @Override
    public Set<Booking> getAll() {
        return repository.getAll();
    }

}
