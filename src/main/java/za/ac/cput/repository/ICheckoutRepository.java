package za.ac.cput.repository;

import za.ac.cput.domain.Checkout;

import java.util.Set;

public interface ICheckoutRepository extends IRepository<Checkout, String>{
    Set<Checkout> getAll();
}
