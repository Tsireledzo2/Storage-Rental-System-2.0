/**
 * DriverFactory.java
 * Class for the DriverFactory
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 06 June 2023
 */
package za.ac.cput.factory;

import za.ac.cput.domain.*;
import za.ac.cput.util.Helper;

public class DriverFactory {
    public static Driver buildDriver(String job_description,Employee employee){
        if(Helper.isNullorEmpty(job_description)){
            return null;
        }

        String licenceNumber = Helper.generateNumber();

        Driver driver = new Driver.Builder()
                .setLicence_number(licenceNumber)
                .setJob_description(job_description)
                .setEmployee(employee)
                .buildDriver();
        return driver;
    }
}
