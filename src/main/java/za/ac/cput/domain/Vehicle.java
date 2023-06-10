/**
 * Vehicle.java
 * Entity for the Vehicle
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 06 June 2023
 */
package za.ac.cput.domain;

import java.util.Objects;
//ar
public class Vehicle {
    private String numberPlate;
    private String vehicleMake;
    private String vehicleColor;
    private String year;
    private String vehicleName;

    private Vehicle(){}

    //builder constructor
    private Vehicle(Builder builder){
        this.numberPlate = builder.numberPlate;
        this.vehicleMake = builder.vehicleMake;
        this.vehicleColor = builder.vehicleColor;
        this.year = builder.year;
        this.vehicleName = builder.vehicleName;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public String getvehicleColor() {
        return vehicleColor;
    }
    public String getYear() {
        return year;
    }
    public String getvehicleName() {
        return vehicleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return numberPlate.equals(vehicle.numberPlate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberPlate);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "numberPlate='" + numberPlate + '\'' +
                ", vehicleMake='" + vehicleMake + '\'' +
                ", vehicleColor='" + vehicleColor + '\'' +
                ", year='" + year + '\'' +
                ", vehicleName='" + vehicleName + '\'' +
                '}';
    }

    public static class Builder{
        private String numberPlate;
        private String vehicleMake;
        private String vehicleColor;
        private String year;
        private String vehicleName;

        public Builder setNumberPlate(String numberPlate) {
            this.numberPlate = numberPlate;
            return this;
        }
        public Builder setVehicleMake(String vehicleMake) {
            this.vehicleMake = vehicleMake;
            return this;
        }
        public Builder setVehicleColor(String vehicleColor) {
            this.vehicleColor = vehicleColor;
            return this;
        }
        public Builder setYear(String year) {
            this.year = year;
            return this;
        }
        public Builder setVehicleName(String vehicleName) {
            this.vehicleName = vehicleName;
            return this;
        }


        public Builder copy(Vehicle vehicle){
            this.numberPlate = vehicle.numberPlate;
            this.vehicleMake = vehicle.vehicleMake;
            this.vehicleColor = vehicle.vehicleColor;
            this.year = vehicle.year;
            this.vehicleName = vehicle.vehicleName;
            return this;
        }

        public Vehicle build(){
            return new Vehicle(this);
        }
    }
}