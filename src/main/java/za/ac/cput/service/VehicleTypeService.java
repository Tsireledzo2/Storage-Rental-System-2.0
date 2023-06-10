package za.ac.cput.service;

import za.ac.cput.domain.VehicleType;

import java.util.Set;

public interface VehicleTypeService extends IService<VehicleType,String> {
    public Set<VehicleType>getAll();
}
