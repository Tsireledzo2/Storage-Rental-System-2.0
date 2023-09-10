/**
 * IVehicleRepository.java
 * Interface for the IVehicleRepository
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 06 June 2023
 */
package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Vehicle;

import java.util.List;
@Repository
public interface IVehicleRepository extends JpaRepository<Vehicle,String> {
   // public List<Vehicle> getAll();
}
