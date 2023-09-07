package za.ac.cput.service.impl;
/*
 * CheckoutServiceImpl.java
 * CheckoutServiceImpl Entity
 * @author: Argus Hakizimana Mbogo (220073260)
 * Date: 09 June 2023
 */

import org.springframework.stereotype.Service;
import za.ac.cput.domain.Checkout;
import za.ac.cput.repository.ICheckoutRepository;
import za.ac.cput.repository.impl.CheckoutImpl;
import za.ac.cput.service.CheckoutService;
import za.ac.cput.service.IService;

import java.util.Set;
@Service
public class CheckoutServiceImpl implements CheckoutService {

    private static CheckoutServiceImpl service;

    private final ICheckoutRepository repository;

    private CheckoutServiceImpl() {
        repository = CheckoutImpl.getCheckOutRepository();
    }

    public static CheckoutServiceImpl getService() {
        return (service == null)? service = new CheckoutServiceImpl(): service;
    }

    @Override
    public Checkout create(Checkout checkout) {
        return repository.create(checkout);
    }

    @Override
    public Checkout read(String id) {
        return repository.read(id);
    }

    @Override
    public Checkout update(Checkout checkout) {
        return repository.update(checkout);
    }

    @Override
    public boolean delete(String id) {
        return repository.delete(id);
    }


    @Override
    public Set<Checkout> getAll() {
        return repository.getAll();
    }
}
