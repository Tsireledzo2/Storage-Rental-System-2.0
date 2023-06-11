package za.ac.cput.service;
/*
 * CheckoutService.java
 * CheckoutService Entity
 * @author: Argus Hakizimana Mbogo (220073260)
 * Date: 09 June 2023
 */
import za.ac.cput.domain.Checkout;

import java.util.Set;

public interface CheckoutService extends IService<Checkout, String>{

    Set<Checkout> getAll();
}
