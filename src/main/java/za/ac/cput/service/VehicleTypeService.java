package za.ac.cput.service;

import za.ac.cput.domain.VehicleType;

import java.util.Set;
//ar
public interface VehicleTypeService extends IService<VehicleType,String> {
    public Set<VehicleType>getAll();
}
