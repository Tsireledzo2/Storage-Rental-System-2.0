/**
 * This worked as a basecode
 * IVehicleTypeRepository.java
 * Interface for the IVehicleTypeRepository
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 08 April 2023
 */
package za.ac.cput.repository;

import za.ac.cput.domain.VehicleType;

import java.util.Set;
//ar
public interface IVehicleTypeRepository extends IRepository<VehicleType,String>{
    public Set<VehicleType> getAll();
}
