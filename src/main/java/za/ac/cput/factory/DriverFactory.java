/**
 * DriverFactory.java
 * Class for the DriverFactory
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 08 April 2023
 */
package za.ac.cput.factory;

import za.ac.cput.domain.Driver;
import za.ac.cput.util.Helper;

public class DriverFactory {
    public static Driver buildDriver(String firstName, String lastName, String email, String password){
        if(Helper.isNullorEmpty(firstName)||Helper.isNullorEmpty(lastName)){
            return null;
        }

        String licenceNumber = Helper.generateNumber();
        if(!Helper.isValidEmail(email)){
            return null;
        }

        Driver driver = new Driver.Builder()
                .setLicenceNumber(licenceNumber)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setPassword(password)
                .build();
        return driver;
    }
}
