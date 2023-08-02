/*
AdminFactory.java
This is the Factory class
author : Lithemba Nkqayi(220558558)
6 June 2023
 */
package za.ac.cput.factory;

import za.ac.cput.domain.Admin;
import za.ac.cput.util.Helper;

public class AdminFactory {
    public static Admin createAdmin(String employeeNumber,String job_description,String adminID, String first_name, String last_name, String email, String password){


        Admin admin = new Admin.Builder()
                .setAdminID(adminID)
                .setJob_description(job_description)
                .setEmployee(EmployeeFactory.buildEmployee(first_name,last_name,email,password))
                .build();

        return admin;
    }
}
