/*
Admin.java
This is the Admin class
author : Lithemba Nkqayi(220558558)
Date : 6 June 2023
 */
package za.ac.cput.domain;

public class Admin {
    private String adminID;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    private Admin() {
    }
    private Admin(Builder builder){
        this.adminID = builder.adminId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.password = builder.password;
    }

    public String getAdminID() {
        return adminID;
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
    public String toString() {
        return "Admin{" +
                "adminId='" + adminID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static class Builder{
        private String adminId;
        private String firstName;
        private String lastName;
        private String email;
        private String password;

        public Builder setAdminId(String adminId) {
            this.adminId = adminId;
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

        public Builder copy(Admin admin){
            this.adminId = adminId;
            this.firstName = admin.firstName;
            this.lastName = admin.lastName;
            this.email = admin.email;
            this.password = admin.password;
            return this;
        }
        public Admin build(){
            return new Admin(this);
        }
    }

}
