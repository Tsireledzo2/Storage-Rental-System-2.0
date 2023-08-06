/**
 * IVehicleRepository.java
 * Interface for the IVehicleRepository
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 06 June 2023
 */
package za.ac.cput.repository;

import za.ac.cput.domain.Vehicle;

import java.util.Set;

public interface IVehicleRepository extends IRepository<Vehicle,String> {
    public Set<Vehicle> getAll();
}
