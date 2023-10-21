package za.ac.cput.domain;
/*
Ndumiso Nkululeko Ngcobo
This is customer class
220094861
 */

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Customer {

    @Id
    private String email;
    private String fullName;
    private String cellphone;
    private String password;
    private boolean agreeToTerms;

    @ManyToMany(fetch = FetchType.EAGER  , cascade = CascadeType.PERSIST)
    List<Role> roles ;

    public Customer (String email , String password , List<Role> roles) {
        this.email= email ;
        this.password=password ;
        this.roles=roles ;}

   public Customer(){

   }
    public Customer(Builder builder){

        this.email = builder.email;
        this.cellphone = builder.cellphone;
        this.fullName = builder.fullName;
        this.password =builder.password;
        this.agreeToTerms = builder.agreeToTerms;

    }



    public String getFullName() {
        return fullName;
    }



    public String getEmail() {
        return email;
    }

    public String getCellphone() {
        return cellphone;
    }
    public String getPassword(){
       return password;
    }

    public boolean getAgreeToTerms(){
       return agreeToTerms;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public void setAgreeToTerms(boolean agreeToTerms) {
        this.agreeToTerms = agreeToTerms;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Customer{" +

                ", Full Name='" + fullName + '\'' +

                ", Email='" + email + '\'' +
                ", Cellphone='" + cellphone + '\'' +
                ", Password='" + password + '\'' +
                ", Agree To Terms='" + agreeToTerms + '\'' +
                '}';
    }

    public static class Builder{

        private String fullName;

        private String email;
        private String cellphone;
        private String password;
        private boolean agreeToTerms;



        public Builder setFullName(String fullName) {
            this.fullName = fullName;
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

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setAgreeToTerms(boolean agreeToTerms) {
            this.agreeToTerms = agreeToTerms;
            return this;
        }

        public Builder copy(Customer customer){

            this.fullName = customer.fullName;
            this.email = customer.email;
            this.cellphone = customer.cellphone;
            this.password = customer.password;
            this.agreeToTerms = customer.agreeToTerms;
            return this;
        }
        public Customer build(){
            return new Customer(this);
        }
    }
}
