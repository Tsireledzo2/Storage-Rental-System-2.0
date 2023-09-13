/**
 * Driver.java
 * Entity for the Driver
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 06 June 2023
 */
package za.ac.cput.domain;

import jakarta.persistence.*;

@Entity
public class Driver {

    @Id
    private String licence_number;
    private String job_description;


    @OneToOne
    @JoinColumn(name = "employeeNumber")
    private Employee employee;

    public Driver(){}

    public Driver(Builder builder){
        this.job_description = builder.job_description;
        this.employee = builder.employee;
        this.licence_number = builder.licence_number;
    }
    public String getJob_description() {
        return job_description;
    }

    public String getLicence_number() {
        return licence_number;
    }

    public Employee getEmployee() {
        return employee;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "licence_number='" + licence_number + '\'' +
                ", job_description='" + job_description + '\'' +
                ", employee=" + employee +
                '}';
    }

    public static class Builder{
        private String job_description;
        private Employee employee;
        private String licence_number;

        public Builder setJob_description(String job_description) {
            this.job_description = job_description;
            return this;
        }

        public Builder setEmployee(Employee employee) {
            this.employee = employee;
            return this;
        }

        public Builder setLicence_number(String licence_number) {
            this.licence_number = licence_number;
            return this;
        }

        public Builder copy(Driver driver){
            this.job_description = driver.job_description;
            this.employee = driver.employee;
            this.licence_number = driver.licence_number;
            return this;
        }

        public Driver buildDriver(){
            return new Driver(this);
        }
    }

}