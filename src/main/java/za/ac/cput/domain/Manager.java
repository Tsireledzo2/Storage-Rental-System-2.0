package za.ac.cput.domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String managerIndex;
    private String job_description;
    @OneToOne
    @JoinColumn(name = "employeeNumber")
    private Employee employee;

    public Manager(){}

    public Manager(Builder builder){
        this.job_description = builder.job_description;
        this.employee = builder.employee;
    }
    public String getManagerIndex() {
        return managerIndex;
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
        Manager manager = (Manager) o;
        return Objects.equals(managerIndex, manager.managerIndex) && Objects.equals(job_description, manager.job_description) && Objects.equals(employee, manager.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(managerIndex, job_description, employee);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerIndex='" + managerIndex + '\'' +
                ", job_description='" + job_description + '\'' +
                ", employee=" + employee +
                '}';
    }
    public static class Builder{
        // private String managerIndex;
        private String job_description;
        private Employee employee;

        public Builder setJob_description(String job_description) {
            this.job_description = job_description;
            return this;
        }

        public Builder setEmployee(Employee employee) {
            this.employee = employee;
            return this;
        }

        public Builder Copy(Manager manager){
            this.job_description = manager.job_description;
            this.employee = manager.employee;
            return this;
        }
        public Manager build(){
            return new Manager(this);
        }
    }
}