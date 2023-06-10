package za.ac.cput.service;

import za.ac.cput.domain.Driver;
import za.ac.cput.domain.Vehicle;

import java.util.Set;

public interface VehicleService extends IService <Vehicle,String>{
    public Set<Vehicle> getAll();
}
