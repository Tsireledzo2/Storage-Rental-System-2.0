package za.ac.cput.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Vehicle;
import za.ac.cput.domain.VehicleType;
import za.ac.cput.factory.VehicleFactory;
import za.ac.cput.factory.VehicleTypeFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
class VehicleServiceTest {

    @Autowired
    VehicleService vehicleService;

    VehicleType vehicleType = VehicleTypeFactory.buildVehicleType("Truck",1000,700.00);
    Vehicle vehicle = VehicleFactory.buildVehicle("ABC 366 543","Toyota","Black","2016","Hilux 4x4",vehicleType);

    @Test
    void a_create() {
        // Act
        Vehicle vehicle1 = vehicleService.create(vehicle);

        // Assert
        assertNotNull(vehicle1);
        assertEquals("ABC 366 543",vehicle1.getNumberPlate());
    }

    @Test
    void b_read() {
        // Act
        Vehicle vehicle1 = vehicleService.read(vehicle.getNumberPlate());

        // Assert
        assertNotNull(vehicle1);
        assertEquals("Toyota",vehicle1.getVehicleMake());
    }

    @Test
    void update() {
        // no test
    }

    @Test
    void d_delete() {
        vehicleService.delete(vehicle.getNumberPlate());

        List<Vehicle> vehicles;
        vehicles = vehicleService.getAll();

        assertFalse(vehicles.contains(vehicle));
    }

    @Test
    void c_getAll() {
        List<Vehicle> vehicles;
        vehicles = vehicleService.getAll();

        assertNotNull(vehicles);
        assertTrue(vehicles.contains(vehicle));
    }
}