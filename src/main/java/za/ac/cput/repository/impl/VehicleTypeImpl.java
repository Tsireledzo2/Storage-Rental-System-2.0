/**
 * This worked as a basecode
 * VehicleTypeImpl.java
 * Class for the VehicleTypeImpl
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 08 April 2023
 */
package za.ac.cput.repository.impl;

import za.ac.cput.domain.VehicleType;
import za.ac.cput.repository.IVehicleTypeRepository;

import java.util.HashSet;
import java.util.Set;

public class VehicleTypeImpl implements IVehicleTypeRepository {
    private static VehicleTypeImpl vehicleTypeRepository = null;

    private Set<VehicleType> vehicleTypeDB = null;

    private VehicleTypeImpl() {
        vehicleTypeDB = new HashSet<VehicleType>();
    }

    public static VehicleTypeImpl getVehicleTypeRepository() {
        if (vehicleTypeRepository == null) {
            vehicleTypeRepository = new VehicleTypeImpl();
        }
        return vehicleTypeRepository;
    }

    @Override
    public VehicleType create(VehicleType vehicleType) {
        boolean success = vehicleTypeDB.add(vehicleType);
        System.out.println("vehicleTypes: " + vehicleTypeDB);
        if (!success)
            return null;
        return vehicleType;
    }

    @Override
    public VehicleType read(String vehicleDescription) {
        //use lambda to read
        VehicleType vehicleType = vehicleTypeDB.stream().filter(vehicleType1 -> vehicleType1.getVehicleDescription().equals(vehicleDescription))
                .findAny()
                .orElse(null);

        return vehicleType;
    }

    @Override
    public VehicleType update(VehicleType vehicleType) {
        VehicleType oldVehicleType = read(vehicleType.getVehicleDescription());
        if (oldVehicleType != null) {
            vehicleTypeDB.remove(oldVehicleType);
            vehicleTypeDB.add(vehicleType);
            return vehicleType;
        }
        return null;
    }

    @Override
    public boolean delete(String vehicleDescription) {
        VehicleType vehicleTypeToDelete = read(vehicleDescription);
        if (vehicleTypeToDelete == null)
            return false;
        vehicleTypeDB.remove(vehicleTypeToDelete);
        return true;
    }

    @Override
    public Set<VehicleType> getAll() {
        return vehicleTypeDB;
    }

}
