package za.ac.cput.domain;

import jakarta.persistence.*;

/*
Ndumiso Nkululeko Ngcobo
220094861
This is an Address Class
 */
@Entity
public class Address {
    @Id
    @GeneratedValue
    private Long addressID;
    private String streetNumber;
    private String streetName;
    private String state;
    private String zipCode;
    @OneToOne
    @JoinColumn(name = "bookingNumber")
    private Booking booking;
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

    public Booking getBooking() {
        return booking;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressID='" + addressID + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", booking=" + booking +
                '}';
    }

    private Address(Builder builder){

        this.streetNumber = builder.streetNumber;
        this.state = builder.state;
        this.zipCode  = builder.zipCode;
        this.streetName = builder.streetName;
        this.booking = builder.booking;
    }
    public static class Builder{
        private String streetNumber;
        private String streetName;
        private String state;
        private String zipCode;
        private Booking booking;

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

        public Builder setBooking(Booking booking) {
            this.booking = booking;
            return this;
        }

        public Builder copy(Address address){
            this.streetNumber = address.streetNumber;
            this.state = address.state;
            this.zipCode = address.zipCode;
            this.streetName = address.streetName;
            this.booking = address.booking;
            return this;
        }

        public Address build() {
            return new Address(this);

        }
    }

}
