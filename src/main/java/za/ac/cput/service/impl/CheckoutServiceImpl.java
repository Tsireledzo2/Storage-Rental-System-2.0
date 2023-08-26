package za.ac.cput.service.impl;
/*
 * CheckoutServiceImpl.java
 * CheckoutServiceImpl Entity
 * @author: Argus Hakizimana Mbogo (220073260)
 * Date: 09 June 2023
 */

import za.ac.cput.domain.Checkout;
import za.ac.cput.repository.ICheckoutRepository;
import za.ac.cput.repository.impl.CheckoutImpl;
import za.ac.cput.service.CheckoutService;
import za.ac.cput.service.IService;

import java.util.Set;

public class CheckoutServiceImpl implements CheckoutService {

    private static CheckoutServiceImpl service;

    private ICheckoutRepository repository;

    private CheckoutServiceImpl() {
        repository = CheckoutImpl.getCheckOutRepository();
    }

    public static CheckoutServiceImpl getService() {
        return (service == null)? service = new CheckoutServiceImpl(): null;
    }

    @Override
    public Checkout create(Checkout checkout) {
        return repository.create(checkout);
    }

    @Override
    public Checkout read(String s) {
        return repository.read(s);
    }

    @Override
    public Checkout update(Checkout checkout) {
        return repository.update(checkout);
    }

    @Override
    public boolean delete(String s) {
        return repository.delete(s);
    }


    @Override
    public Set<Checkout> getAll() {
        return repository.getAll();
    }
}
