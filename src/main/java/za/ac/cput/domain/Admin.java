/*
Admin.java
This is the Admin class
author : Lithemba Nkqayi(220558558)
Date : 28 July 2023
 */
package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.util.Objects;

@Entity
public class Admin {
    @Id
    private String adminID;
    private String job_description;
    @OneToOne
    @JoinColumn(name = "employeeNumber")
    private Employee employee;

    public Admin(){}
    public Admin (Builder builder){
        this.job_description = builder.job_description;
        this.employee = builder.employee;
    }

    public String getAdminID() {
        return adminID;
    }
    public String getJob_description() {
        return job_description;
    }

    public Employee getEmployee() {
        return employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return Objects.equals(adminID, admin.adminID) && Objects.equals(job_description, admin.job_description) && Objects.equals(employee, admin.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminID, job_description, employee);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminID='" + adminID + '\'' +
                ", job_description='" + job_description + '\'' +
                ", employee=" + employee +
                '}';
    }

    public static class Builder{
        private String adminID;
        private String job_description;
        private Employee employee;

        public Builder setAdminID(String adminID){
            this.adminID = adminID;
            return this;
        }
        public Builder setJob_description(String job_description) {
            this.job_description = job_description;
            return this;
        }

        public Builder setEmployee(Employee employee) {
            this.employee = employee;
            return this;
        }

        public Builder copy(Admin admin){
            this.adminID = admin.adminID;
            this.job_description = admin.job_description;
            this.employee = admin.employee;
            return this;
        }
        public Admin build(){
            return new Admin(this);
        }

    }
}
