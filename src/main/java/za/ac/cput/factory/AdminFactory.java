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
    public static Admin createAdmin(String firstName, String lastName, String email, String password){

        if(Helper.isNullorEmpty(firstName)||Helper.isNullorEmpty(lastName)){
            return null;
        }

        String adminID = Helper.generateId();
        if (!Helper.isValidEmail(email)){
            return null;
        }
        Admin admin = new Admin.Builder()
                .setAdminID(adminID)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setPassword(password)
                .build();

        return admin;
    }
}
