/**
 * VehicleServiceImpl.java
 * Class for the VehicleServiceImpl
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 06 June 2023
 */
package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Vehicle;
import za.ac.cput.repository.IVehicleRepository;
import za.ac.cput.service.IVehicleService;

import java.util.List;
@Service
public class VehicleService implements IVehicleService {
    private static IVehicleRepository vehicleRepository;

    @Autowired
    private VehicleService(IVehicleRepository vehicleRepository){
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Vehicle create(Vehicle vehicle) {
        return this.vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle read(String numberPlate) {
        return this.vehicleRepository.findById(numberPlate).orElse(null);
    }

    @Override
    public Vehicle update(Vehicle vehicle) {
        if(this.vehicleRepository.existsById(vehicle.getNumberPlate()))
            return this.vehicleRepository.save(vehicle);
        return null;
    }

    @Override
    public boolean delete(String numberPlate) {
        if(this.vehicleRepository.existsById(numberPlate)) {
            this.vehicleRepository.deleteById(numberPlate);
            return true;
        }
        return false;
    }

    @Override
    public List<Vehicle> getAll() {
        return this.vehicleRepository.findAll();
    }
}