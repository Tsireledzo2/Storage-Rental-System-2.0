package za.ac.cput.repository;
/*
 * ICheckoutRepository.java
 * ICheckoutRepository Entity
 * @author: Argus Hakizimana Mbogo (220073260)
 * Date: 09 June 2023
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Checkout;

import java.util.Set;
@Repository
public interface ICheckoutRepository extends JpaRepository<Checkout, String> {
    Set<Checkout> getAll();
}
