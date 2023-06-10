package za.ac.cput.factory;

import za.ac.cput.domain.Checkin;

public class CheckinFactory {

    public static Checkin createCheckin(String driverStatus, String vehicleStatus) {

        Checkin checkin = new Checkin.Builder().setDriverStatus(driverStatus).setVehicleStatus(vehicleStatus)

                .build();
        return checkin;
    }


}
