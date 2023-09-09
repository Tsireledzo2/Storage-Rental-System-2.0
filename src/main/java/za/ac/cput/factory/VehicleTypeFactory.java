/**
 * This is a basecode
 * VehicleTypeFactory.java
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 06 June 2023
 */
package za.ac.cput.factory;

import za.ac.cput.domain.VehicleType;
import za.ac.cput.util.Helper;

public class VehicleTypeFactory {


    public static VehicleType buildVehicleType(String vehicleDescription, int capacity,double vehiclePrice){
        if(Helper.isNullorEmpty(vehicleDescription)){
            return null;
        }

        VehicleType vehicleType = new VehicleType.Builder()
                .setVehicleDescription(vehicleDescription)
                .setCapacity(capacity)
                .setVehiclePrice(vehiclePrice)
                .build();
        return vehicleType;
    }
}