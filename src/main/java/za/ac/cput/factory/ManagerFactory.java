
/*
ManagerFactory.java
This is the Factory class
author : Lithemba Nkqayi(220558558)
6 June 2023
 */
package za.ac.cput.factory;
import za.ac.cput.domain.Manager;
import za.ac.cput.util.Helper;
public class ManagerFactory {

    public static Manager createManager(String firstName,String lastName,String email,String password){

        if(Helper.isNullorEmpty(firstName)||Helper.isNullorEmpty(lastName)){
            return null;
        }
        String managerID = Helper.generateId();
        if (!Helper.isValidEmial(email)){
            return null;
        }

        Manager manager = new Manager.Builder()
                .setManagerID(managerID)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setPassword(password)
                .build();

        return manager;
    }
}





