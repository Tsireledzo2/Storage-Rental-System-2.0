/**
 * Driver.java
 * Entity for the Driver
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 06 June 2023
 */
package za.ac.cput.domain;

import java.util.Objects;
//ar
public class Driver {
    private String licenceNumber;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    private Driver(){}

    private Driver(Builder builder){
        this.licenceNumber = builder.licenceNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.password = builder.password;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return licenceNumber.equals(driver.licenceNumber) && email.equals(driver.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(licenceNumber, email);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "  firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", licenceNumber='" + licenceNumber + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static class Builder{
        private String licenceNumber;
        private String firstName;
        private String lastName;
        private String email;
        private String password;

        public Builder setLicenceNumber(String licenceNumber) {
            this.licenceNumber = licenceNumber;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder copy(Driver driver){
            this.licenceNumber = driver.licenceNumber;
            this.firstName = driver.firstName;
            this.lastName = driver.lastName;
            this.email = driver.email;
            this.password = driver.password;
            return this;
        }

        public Driver build(){
            return new Driver(this);
        }
    }
}