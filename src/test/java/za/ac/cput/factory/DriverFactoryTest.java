/**
 * DriverFactoryTest.java
 * Class for the DriverFactoryTest
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 06 June 2023
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Driver;
import za.ac.cput.domain.Employee;

import static org.junit.jupiter.api.Assertions.*;
class DriverFactoryTest {
    @Test
    void createVehicleFactory(){
        Employee employee = EmployeeFactory.buildEmployee("E234","Tsireledzo","Makhado","tsire@gamil.com","1234");
        Driver driver = DriverFactory.buildDriver("987654321","Driver",employee);
        System.out.println("Driver: " +driver);
        assertNotNull(driver.getLicence_number());
    }
}