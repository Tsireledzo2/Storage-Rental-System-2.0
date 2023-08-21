/**
 * VehicleServiceImpl.java
 * Class for the VehicleServiceImpl
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 06 June 2023
 */
package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.domain.Vehicle;
import za.ac.cput.repository.IVehicleRepository;
import za.ac.cput.service.IVehicleService;

import java.util.Set;

public class VehicleService implements IVehicleService {
    private static IVehicleRepository vehicleRepository;

    @Autowired
    private VehicleService(IVehicleRepository vehicleRepository){
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Vehicle create(Vehicle vehicle) {
        return null;
    }

    @Override
    public Vehicle read(String s) {
        return null;
    }

    @Override
    public Vehicle update(Vehicle vehicle) {
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public Set<Vehicle> getAll() {
        return null;
    }
}
