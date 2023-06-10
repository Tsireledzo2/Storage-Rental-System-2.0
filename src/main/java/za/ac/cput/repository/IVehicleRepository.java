package za.ac.cput.repository;

import za.ac.cput.domain.Vehicle;

import java.util.Set;

public interface IVehicleRepository extends IRepository<Vehicle,String> {
    public Set<Vehicle> getAll();
}
