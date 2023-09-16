package za.ac.cput.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import za.ac.cput.domain.Driver;
import za.ac.cput.domain.Employee;
import za.ac.cput.factory.DriverFactory;
import za.ac.cput.factory.EmployeeFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
class DriverServiceImplTest {

    @Autowired
    DriverServiceImpl driverService;

    @Autowired
    EmployeeService employeeService;

    public Employee employee = EmployeeFactory.buildEmployee("A6557","Makhado","Tsireledzo","2211516273@mycput.ac.za","4646644");
    public Driver driver = DriverFactory.buildDriver("1234567","Driver",employee);
    @Test
    void create() {
        // Act
        Employee employee1 = employeeService.create(employee);
        Driver driver1 = driverService.create(driver);

        // Assert
        assertNotNull(employee1);
        assertNotNull(driver1);
        assertEquals("Driver",driver1.getJob_description());
    }

    @Test
    void read() {
        // Act
        Driver driver1 = driverService.read(driver.getLicence_number());

        // Assert
        assertNotNull(driver1);
        assertEquals(driver1.getLicence_number(),driver.getLicence_number());
    }

    @Test
    void update() {
        //we don't update the information
    }

    @Test
    void delete() {
        driverService.delete(driver.getLicence_number());

        List<Driver> drivers;
        drivers = driverService.getAll();

        assertFalse(drivers.contains(driver));

    }

    @Test
    void getAll() {
        List<Driver> drivers;
        drivers = driverService.getAll();

        assertNotNull(drivers);
    }
}