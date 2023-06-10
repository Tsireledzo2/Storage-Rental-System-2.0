package za.ac.cput.domain;

public class Checkin {
    private boolean driverStatus, vehicleStatus;

    public Checkin(boolean driverStatus, boolean vehicleStatus) {
        this.driverStatus = driverStatus;
        this.vehicleStatus = vehicleStatus;
    }

    private Checkin(Builder builder){
        this.driverStatus = builder.driverStatus;
        this.vehicleStatus = builder.vehicleStatus;
    }

    public boolean isDriverStatus() {
        return driverStatus;
    }

    public boolean isVehicleStatus() {
        return vehicleStatus;
    }

    @Override
    public String toString() {
        return "Checkin{" +
                "driverStatus=" + driverStatus +
                ", vehicleStatus=" + vehicleStatus +
                '}';
    }
//
    public static class Builder {

        private boolean driverStatus;
        private boolean vehicleStatus;

        public Builder setDriverStatus(boolean driverStatus) {
            this.driverStatus = driverStatus; return this;
        }

        public Builder setVehicleStatus(boolean vehicleStatus) {
            this.vehicleStatus = vehicleStatus; return this;
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
