package za.ac.cput.factory;
/*
 * CheckinFactory.java
 * CheckinFactory Entity
 * @author: Argus Hakizimana Mbogo (220073260)
 * Date: 09 June 2023
 */

import za.ac.cput.domain.Checkin;

public class CheckinFactory {

    public static Checkin createCheckin(String driverStatus, String vehicleStatus) {

        Checkin checkin = new Checkin.Builder().setDriverStatus(driverStatus).setVehicleStatus(vehicleStatus)

                .build();
        return checkin;
    }


}
