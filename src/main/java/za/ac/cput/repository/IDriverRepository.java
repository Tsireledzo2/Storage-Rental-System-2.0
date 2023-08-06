/**
 * IDriverRepository.java
 * Interface for the IDriverRepository
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 06 June 2023
 */
package za.ac.cput.repository;

import za.ac.cput.domain.Driver;

import java.util.Set;

public interface IDriverRepository extends IRepository<Driver,String> {
    public Set<Driver> getAll();
}
