///**
// * VehicleRepositoryImpl.java
// * Class for the VehicleRepositoryImpl
// * @author: Tsireledzo Wisdom Makhado (221116273)
// * Date: 06 June 2023
// */
//package za.ac.cput.repository.impl;
//
//import za.ac.cput.domain.Vehicle;
//import za.ac.cput.repository.IVehicleRepository;
//
//import java.util.HashSet;
//import java.util.Set;
//@Deprecated
//public class VehicleRepositoryImpl implements IVehicleRepository {
//    private static VehicleRepositoryImpl vehicleRepository= null;
//    private static Set<Vehicle> vehicleDB = null;
//
//    public VehicleRepositoryImpl(){
//        vehicleDB = new HashSet<Vehicle>();
//
//    }
//    public static VehicleRepositoryImpl getVehicleRepository(){
//        if(vehicleRepository==null)
//            vehicleRepository=new VehicleRepositoryImpl();
//        return vehicleRepository;
//    }
//    @Override
//    public Vehicle create(Vehicle vehicle) {
//        boolean success = vehicleDB.add(vehicle);
//        if(!success)
//            return null;
//        return vehicle;
//    }
//
//    @Override
//    public Vehicle read(String numberPlate) {
//        Vehicle readVehicle = vehicleDB.stream().filter(vehicle -> vehicle.getNumberPlate().equals(numberPlate))
//                .findAny().orElse(null);
//        return readVehicle;
//    }
//
//    @Override
//    public Vehicle update(Vehicle vehicle) {
//        Vehicle oldVehicle = vehicleRepository.read(vehicle.getNumberPlate());
//        if(oldVehicle==null)
//            return null;
//        vehicleDB.remove(oldVehicle);
//        vehicleDB.add(vehicle);
//        return vehicle;
//    }
//
//    @Override
//    public boolean delete(String numberPlate) {
//        Vehicle deleteVehicle = vehicleRepository.read(numberPlate);
//        if(deleteVehicle==null)
//            return false;
//        vehicleDB.remove(deleteVehicle);
//        return true;
//    }
//
//    @Override
//    public Set<Vehicle> getAll() {
//        return vehicleDB;
//    }
//}
