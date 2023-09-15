/**
 * Vehicle.java
 * Entity for the Vehicle
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 06 June 2023
 */
package za.ac.cput.domain;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;
@Entity
public class Vehicle {
    @Id
    private String numberPlate;
    private String vehicleMake;
    private String vehicleColor;
    private String year;
    private String vehicleName;
    @Embedded
    private VehicleType vehicleType;

    public Vehicle(){}

    //builder constructor
    private Vehicle(Builder builder){
        this.numberPlate = builder.numberPlate;
        this.vehicleMake = builder.vehicleMake;
        this.vehicleColor = builder.vehicleColor;
        this.year = builder.year;
        this.vehicleName = builder.vehicleName;
        this.vehicleType = builder.vehicleType;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public String getYear() {
        return year;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
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
                ", vehicleType=" + vehicleType +
                '}';
    }

    public static class Builder{
        private String numberPlate;
        private String vehicleMake;
        private String vehicleColor;
        private String year;
        private String vehicleName;
        private VehicleType vehicleType;

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

        public Builder setVehicleType(VehicleType vehicleType) {
            this.vehicleType = vehicleType;
            return this;
        }

        public Builder copy(Vehicle vehicle){
            this.numberPlate = vehicle.numberPlate;
            this.vehicleMake = vehicle.vehicleMake;
            this.vehicleColor = vehicle.vehicleColor;
            this.year = vehicle.year;
            this.vehicleName = vehicle.vehicleName;
            this.vehicleType = vehicle.vehicleType;
            return this;
        }

        public Vehicle build(){
            return new Vehicle(this);
        }
    }
}