/**
 * VehicleFactory.java
 * Class for the VehicleFactory
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 08 April 2023
 */
package za.ac.cput.factory;

import za.ac.cput.domain.Vehicle;
import za.ac.cput.util.Helper;

public class VehicleFactory {
    public static Vehicle buildVehicle(String numberPlate,String vehicleMake,String vehicleColor,String year, String vehicleName){
        if(Helper.isNullorEmpty(numberPlate)){
            return null;
        }


        Vehicle vehicle = new Vehicle.Builder()
                .setNumberPlate(numberPlate)
                .setVehicleMake(vehicleMake)
                .setVehicleColor(vehicleColor)
                .setYear(year)
                .setVehicleName(vehicleName)
                .build();
        return vehicle;
    }
}
