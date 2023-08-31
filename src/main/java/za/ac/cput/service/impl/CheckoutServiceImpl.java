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

import za.ac.cput.service.CheckoutService;


import java.util.Set;
@Service
public class CheckoutServiceImpl implements CheckoutService {

    private final ICheckoutRepository repository;

    private CheckoutServiceImpl(ICheckoutRepository repository) {

        this.repository = repository;
    }

    @Override
    public Set<Checkout> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Checkout create(Checkout checkout) {
        return this.repository.save(checkout);
    }

    @Override
    public Checkout read(String id) {
        return this.repository.findById(id).orElse(null);
    }

    @Override
    public Checkout update(Checkout checkout) {
        return this.repository.save(checkout);
    }

    @Override
    public boolean delete(String id) {
        if (this.repository.existsById(id)) {
            this.repository.deleteById(id);
            return true;
        }
        return false;
    }
}
