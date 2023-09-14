/*
AdminFactory.java
This is the Factory class
author : Lithemba Nkqayi(220558558)
6 June 2023
 */
package za.ac.cput.factory;

import za.ac.cput.domain.Admin;
import za.ac.cput.domain.Employee;
import za.ac.cput.util.Helper;

public class AdminFactory {
    public static Admin createAdmin(String adminID,String job_description,Employee employee){

        Admin admin = new Admin.Builder()
                .setAdminID(adminID)
                .setJob_description(job_description)
                .setEmployee(employee)
                .build();

        return admin;
    }
}
