/**
 * VehicleServiceImpl.java
 * Class for the VehicleServiceImpl
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 06 June 2023
 */
package za.ac.cput.service.impl;

import za.ac.cput.domain.Vehicle;
import za.ac.cput.repository.impl.VehicleRepositoryImpl;
import za.ac.cput.service.VehicleService;

import java.util.Set;

public class VehicleServiceImpl implements VehicleService{
    private static VehicleServiceImpl vehicleService = null;
    private static VehicleRepositoryImpl vehicleRepository = null;

    private VehicleServiceImpl(){

        vehicleRepository = VehicleRepositoryImpl.getVehicleRepository();
    }

    public static VehicleServiceImpl getVehicleService(){
        if(vehicleService ==null){
            vehicleService = new VehicleServiceImpl();
        }
        return vehicleService;
    }

    @Override
    public Vehicle create(Vehicle vehicle) {
        Vehicle createVehicle = vehicleRepository.create(vehicle);
        return createVehicle;
    }

    @Override
    public Vehicle read(String numberPlate) {
        Vehicle readVehicle = vehicleRepository.read(numberPlate);
        return readVehicle;
    }

    @Override
    public Vehicle update(Vehicle vehicle) {
        Vehicle updateVehicle = vehicleRepository.update(vehicle);
        return updateVehicle;
    }

    @Override
    public boolean delete(String numberPlate) {
        boolean success = vehicleRepository.delete(numberPlate);
        return success;
    }

    @Override
    public Set<Vehicle> getAll() {
        return vehicleRepository.getAll();
    }
}
