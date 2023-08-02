
/*
ManagerFactory.java
This is the Factory class
author : Lithemba Nkqayi(220558558)
6 June 2023
 */
package za.ac.cput.factory;
import za.ac.cput.domain.Manager;
public class ManagerFactory {

    public static Manager buildManager(String job_description, String first_name, String last_name, String email, String password) {

        Manager manager = new Manager.Builder()
                .setJob_description(job_description)
                .setEmployee(EmployeeFactory.buildEmployee(first_name, last_name, email, password))
                .build();
        return manager;
    }
}





