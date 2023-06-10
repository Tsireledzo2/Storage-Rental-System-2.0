package za.ac.cput.factory;

import za.ac.cput.domain.Checkin;

public class CheckinFactory {
    //ar
    public static Checkin createCheckin(boolean driverStatus, boolean vehicleStatus) {

        Checkin checkin = new Checkin.Builder().setDriverStatus(driverStatus).setVehicleStatus(vehicleStatus)

                .build();
        return checkin;
    }


}
