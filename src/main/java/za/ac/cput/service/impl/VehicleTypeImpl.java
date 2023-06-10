package za.ac.cput.service.impl;

import za.ac.cput.domain.Driver;
import za.ac.cput.domain.VehicleType;
import za.ac.cput.repository.impl.VehicleTypeRepositoryImpl;
import za.ac.cput.service.VehicleTypeService;

import java.util.Set;
//ar
public class VehicleTypeImpl implements VehicleTypeService {
    private static VehicleTypeImpl vehicleTypeService = null;
    private static VehicleTypeRepositoryImpl vehicleTypeRepository = null;

    private VehicleTypeImpl(){

        vehicleTypeRepository = VehicleTypeRepositoryImpl.getVehicleTypeRepository();
    }

    public static VehicleTypeImpl getVehicleTypeService(){
        if(vehicleTypeService ==null){
            vehicleTypeService = new VehicleTypeImpl();
        }
        return vehicleTypeService;
    }

    @Override
    public VehicleType create(VehicleType vehicleType) {
        VehicleType createVehicleType = vehicleTypeRepository.create(vehicleType);
        return createVehicleType;
    }

    @Override
    public VehicleType read(String s) {
        VehicleType readVehicleType = vehicleTypeRepository.read(s);
        return readVehicleType;
    }

    @Override
    public VehicleType update(VehicleType vehicleType) {
        VehicleType updateVehicleType = vehicleTypeRepository.update(vehicleType);
        return updateVehicleType;
    }

    @Override
    public boolean delete(String s) {
        boolean success = vehicleTypeService.delete(s);
        return success;
    }

    @Override
    public Set<VehicleType> getAll() {
        return vehicleTypeRepository.getAll();
    }
}
