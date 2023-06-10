/**
 * This is a basecode
 * VehicleType.java
 * Entity for the VehicleType
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 06 June 2023
 */

package za.ac.cput.domain;

public class VehicleType {
    private String vehicleDescription;
    private int capacity;
    private double vehiclePrice;

    private VehicleType(){}

    private VehicleType(Builder builder){
        this.vehicleDescription = builder.vehicleDescription;
        this.capacity = builder.capacity;
        this.vehiclePrice = builder.vehiclePrice;
    }

    public String getVehicleDescription() {
        return vehicleDescription;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getVehiclePrice() {
        return vehiclePrice;
    }

    @Override
    public String toString() {
        return "VehicleType{" +
                "vehicle size description: " + vehicleDescription + '\'' +
                ", capacity: " + capacity +" large boxes" +
                ", price: " + "R"+vehiclePrice +
                '}';
    }

    public static class Builder{
        private String vehicleDescription;
        private int capacity;
        private double vehiclePrice;

        public Builder setVehicleDescription(String vehicleDescription) {
            this.vehicleDescription = vehicleDescription;
            return this;
        }

        public Builder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setVehiclePrice(double vehiclePrice) {
            this.vehiclePrice = vehiclePrice;
            return this;
        }

        public Builder copy(VehicleType vehicleType){
            this.vehicleDescription = vehicleType.vehicleDescription;
            this.capacity = vehicleType.capacity;
            this.vehiclePrice = vehicleType.vehiclePrice;
            return this;
        }

        public VehicleType build(){
            return new VehicleType(this);
        }
    }
}