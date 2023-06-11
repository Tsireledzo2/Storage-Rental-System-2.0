package za.ac.cput.domain;

/*
 * Checkin.java
 * Checkin Entity
 * @author: Argus Hakizimana Mbogo (220073260)
 * Date: 09 June 2023
 */

public class Checkin {
    private String driverStatus, vehicleStatus;

    public Checkin(String driverStatus, String vehicleStatus) {
        this.driverStatus = driverStatus;
        this.vehicleStatus = vehicleStatus;
    }

    private Checkin(Builder builder){
        this.driverStatus = builder.driverStatus;
        this.vehicleStatus = builder.vehicleStatus;
    }

    public String getDriverStatus() {
        return driverStatus;
    }

    public String getVehicleStatus() {
        return vehicleStatus;
    }

    @Override
    public String toString() {
        return "Checkin{" +
                "driverStatus=" + driverStatus +
                ", vehicleStatus=" + vehicleStatus +
                '}';
    }

    public static class Builder {

        private String driverStatus ,vehicleStatus;

        public Builder setDriverStatus(String driverStatus) {
            this.driverStatus = driverStatus;
            return this;
        }

        public Builder setVehicleStatus(String vehicleStatus) {
            this.vehicleStatus = vehicleStatus;
            return this;
        }

        public Builder copy(Checkin checkin) {
            this.driverStatus = checkin.driverStatus;
            this.vehicleStatus = checkin.vehicleStatus;
            return this;
        }

        public Checkin build() {
            return new Checkin(this);
        }
    }
}
