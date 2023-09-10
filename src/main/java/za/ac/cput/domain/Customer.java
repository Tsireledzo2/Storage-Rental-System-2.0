package za.ac.cput.domain;
/*
Ndumiso Nkululeko Ngcobo
This is customer class
220094861
 */

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Customer {
   @Id
   private String customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

   public Customer(){

   }
    private Customer(Builder builder){
        this.customerId = builder.customerId;
        this.email = builder.email;
        this.lastName = builder.lastName;
        this.phone = builder.phone;
        this.firstName = builder.firstName;

    }

    public String getCustomerId() {
        return customerId;
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

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static class Builder{
        private String customerId;
        private String firstName;
        private String lastName;
        private String email;
        private String phone;

        public Builder setCustomerId(String customerId) {
            this.customerId = customerId;
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

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public Builder copy(Customer customer){
            this.customerId = customer.customerId;
            this.firstName = customer.firstName;
            this.lastName = customer.lastName;
            this.email = customer.email;
            this.phone = customer.phone;
            return this;
        }
        public Customer build(){
            return new Customer(this);
        }
    }
}
