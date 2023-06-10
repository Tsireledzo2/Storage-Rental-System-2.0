package za.ac.cput.service;
import za.ac.cput.domain.Checkout;

import java.util.Set;

public interface CheckoutService extends IService<Checkout, String>{

    Set<Checkout> getAll();
}
