/*
Manager.java
This is the Manager class
author : Lithemba Nkqayi(220558558)
6 June 2023
 */
package za.ac.cput.domain;
//ar
public class Manager {
    private String managerID;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Manager() {
    }
    private Manager (Builder builder){
        this.managerID = builder.managerID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.password = builder.password;

    }
    public String getId() {
        return managerID;
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
        return "Manager{" +
                "managerID='" + managerID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    public static class Builder{
        private String managerID;
        private String firstName;
        private String lastName;
        private String email;
        private String password;

        public Builder setManagerID(String managerID) {
            this.managerID = managerID;
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

        public Builder  setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }
        public Builder copy (Manager manager){
            this.managerID = manager.managerID;
            this.firstName = manager.firstName;
            this.lastName = manager.lastName;
            this.email = manager.email;
            this.password = manager.password;
            return this;
        }
        public Manager build(){return new Manager(this);}
    }
}
