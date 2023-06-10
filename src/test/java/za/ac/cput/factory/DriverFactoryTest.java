/**
 * DriverFactoryTest.java
 * Class for the DriverFactoryTest
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 06 June 2023
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Driver;

import static org.junit.jupiter.api.Assertions.*;
class DriverFactoryTest {
    @Test
    void createVehicleFactory(){
        Driver driver = DriverFactory.buildDriver("Tsireledzo","Makhado","63562526726","tsire@gmail.com");
        System.out.println("Driver: " +driver);
        assertNotNull(driver.getLicenceNumber());
    }
}