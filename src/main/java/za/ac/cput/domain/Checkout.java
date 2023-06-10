package za.ac.cput.domain;

public class Checkout {
    private boolean driverStatus;
    private boolean vehicleStatus;

    public Checkout(boolean driverStatus, boolean vehicleStatus) {
        this.driverStatus = driverStatus;
        this.vehicleStatus = vehicleStatus;
    }

    private Checkout(Builder builder){
        this.driverStatus = builder.driverStatus;
        this.vehicleStatus = builder.vehicleStatus;
    }
    //ar
    public boolean isDriverStatus() {
        return driverStatus;
    }

    public boolean isVehicleStatus() {
        return vehicleStatus;
    }

    @Override
    public String toString() {
        return "Checkout{" +
                "driverStatus=" + driverStatus +
                ", vehicleStatus=" + vehicleStatus +
                '}';
    }

    //
    public static class Builder {

        private boolean driverStatus;
        private boolean vehicleStatus;

        public Builder setDriverStatus(boolean driverStatus) {
            this.driverStatus = driverStatus;return this;
        }

        public Builder setVehicleStatus(boolean vehicleStatus) {
            this.vehicleStatus = vehicleStatus;return this;
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
