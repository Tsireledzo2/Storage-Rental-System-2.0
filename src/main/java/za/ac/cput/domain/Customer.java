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


    private String firstName;
    private String surname;
    @Id
    private String email;
    private String cellphone;

   public Customer(){

   }
    public Customer(Builder builder){

        this.email = builder.email;
        this.surname = builder.surname;
        this.cellphone = builder.cellphone;
        this.firstName = builder.firstName;

    }



    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getCellphone() {
        return cellphone;
    }

    @Override
    public String toString() {
        return "Customer{" +

                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", cellphone='" + cellphone + '\'' +
                '}';
    }

    public static class Builder{

        private String firstName;
        private String surname;
        private String email;
        private String cellphone;


        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setCellphone(String cellphone) {
            this.cellphone = cellphone;
            return this;
        }
        public Builder copy(Customer customer){

            this.firstName = customer.firstName;
            this.surname = customer.surname;
            this.email = customer.email;
            this.cellphone = customer.cellphone;
            return this;
        }
        public Customer build(){
            return new Customer(this);
        }
    }
}
