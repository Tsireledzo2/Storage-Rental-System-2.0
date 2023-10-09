package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/*
Ndumiso Nkululeko Ngcobo
220094861
This is an Address Class
 */
@Entity
public class Address {
    @Id
    @GeneratedValue
    private String addressID;
    private String streetNumber;
    private String streetName;
    private String state;
    private String zipCode;
    public Address(){

    }
    public String getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }


    @Override
    public String toString() {
        return "Address{" +
                "streetNumber='" + streetNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }

    private Address(Builder builder){

        this.streetNumber = builder.streetNumber;
        this.state = builder.state;
        this.zipCode  = builder.zipCode;
        this.streetName = builder.streetName;
    }
    public static class Builder{
        private String streetNumber;
        private String streetName;
        private String state;
        private String zipCode;

        public Builder setStreetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }


        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setState(String state) {
            this.state = state;
            return this;
        }

        public Builder setZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }
        public Builder copy(Address address){
            this.streetNumber = address.streetNumber;
            this.state = address.state;
            this.zipCode = address.zipCode;
            this.streetName = address.streetName;
            return this;
        }

        public Address build() {
            return new Address(this);

        }
    }

}
