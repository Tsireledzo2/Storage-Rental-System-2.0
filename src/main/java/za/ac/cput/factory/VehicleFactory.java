/**
 * VehicleFactory.java
 * Class for the VehicleFactory
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 06 June 2023
 */
package za.ac.cput.factory;

import za.ac.cput.domain.Vehicle;
import za.ac.cput.domain.VehicleType;
import za.ac.cput.util.Helper;

public class VehicleFactory {
    public static Vehicle buildVehicle(String numberPlate, String vehicleMake, String vehicleColor, String year, String vehicleName, VehicleType vehicleType){
        if(Helper.isNullorEmpty(numberPlate)){
            return null;
        }


        Vehicle vehicle = new Vehicle.Builder()
                .setNumberPlate(numberPlate)
                .setVehicleMake(vehicleMake)
                .setVehicleColor(vehicleColor)
                .setYear(year)
                .setVehicleName(vehicleName)
                .setVehicleType(vehicleType)
                .build();
        return vehicle;
    }
}
