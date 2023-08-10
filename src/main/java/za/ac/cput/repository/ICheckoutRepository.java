package za.ac.cput.repository;
/*
 * ICheckoutRepository.java
 * ICheckoutRepository Entity
 * @author: Argus Hakizimana Mbogo (220073260)
 * Date: 09 June 2023
 */

import za.ac.cput.domain.Checkout;

import java.util.Set;

public interface ICheckoutRepository extends IRepository<Checkout, String>{
    Set<Checkout> getAll();
}
