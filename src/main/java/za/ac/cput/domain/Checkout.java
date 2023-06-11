package za.ac.cput.domain;
/*
 * Checkout.java
 * Checkout Entity
 * @author: Argus Hakizimana Mbogo (220073260)
 * Date: 09 June 2023
 */

public class Checkout {
    private String driverStatus, vehicleStatus;

    public Checkout(String driverStatus, String vehicleStatus) {
        this.driverStatus = driverStatus;
        this.vehicleStatus = vehicleStatus;
    }

    private Checkout(Builder builder){
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
        return "Checkout{" +
                "driverStatus=" + driverStatus +
                ", vehicleStatus=" + vehicleStatus +
                '}';
    }

    public static class Builder {

        private String driverStatus;
        private String vehicleStatus;

        public Builder setDriverStatus(String driverStatus) {
            this.driverStatus = driverStatus;
            return this;
        }

        public Builder setVehicleStatus(String vehicleStatus) {
            this.vehicleStatus = vehicleStatus;
            return this;
        }

        public Builder copy(Checkout checkout) {
            this.driverStatus = checkout.driverStatus;
            this.vehicleStatus = checkout.vehicleStatus;
            return this;
        }

        public Checkout build() {
            return new Checkout(this);
        }
    }
}
