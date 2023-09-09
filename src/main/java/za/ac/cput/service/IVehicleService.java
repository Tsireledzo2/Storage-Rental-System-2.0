/**
 * VehicleService.java
 * Interface for the VehicleService
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 06 June 2023
 */
package za.ac.cput.service;

import za.ac.cput.domain.Vehicle;

import java.util.List;

public interface IVehicleService extends IService <Vehicle,String>{
    public List<Vehicle> getAll();
}
