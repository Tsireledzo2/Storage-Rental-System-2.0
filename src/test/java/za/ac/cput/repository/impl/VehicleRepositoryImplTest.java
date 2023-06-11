/**
 * VehicleRepositoryImplTest.java
 * Test Class for the VehicleRepositoryImplTest
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 06 June 2023
 */
package za.ac.cput.repository.impl;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Driver;
import za.ac.cput.domain.Vehicle;
import za.ac.cput.factory.DriverFactory;
import za.ac.cput.factory.VehicleFactory;

import static org.junit.jupiter.api.Assertions.*;

class VehicleRepositoryImplTest {

    private static  VehicleRepositoryImpl vehicleRepository = VehicleRepositoryImpl.getVehicleRepository();
    private static Vehicle vehicle = VehicleFactory.buildVehicle("ABC 363","Toyota","Black","2016","Hilux 4x4");
    private static Vehicle vehicle2 = VehicleFactory.buildVehicle("ABC 21A","FORD","Black","2016","Ranger 4x4");


    @Test
    void a_create() {
        Vehicle createVehicle1 = vehicleRepository.create(vehicle);
        Vehicle createVehicle2 = vehicleRepository.create(vehicle2);
        assertNotEquals(createVehicle1.getNumberPlate(),createVehicle2.getNumberPlate());
        assertEquals(createVehicle1, vehicle);
        assertEquals(createVehicle2, vehicle2);
        System.out.println(createVehicle1 +"\n" +createVehicle2);
    }

    @Test
    void b_read() {
        Vehicle readVehicle = vehicleRepository.read(vehicle.getNumberPlate());
        assertEquals(readVehicle, vehicle);
        System.out.println(readVehicle);
    }
    @Test
    void c_update() {
        Vehicle updateVehicle = new Vehicle.Builder().copy(vehicle)
                .setVehicleColor("black")
                .build();
        assertNotNull(vehicleRepository.update(vehicle));
        System.out.println(updateVehicle);
    }

    @Test
    void d_delete() {
        boolean success = vehicleRepository.delete(vehicle.getNumberPlate());
        assertTrue(success);
        System.out.println("deleted");
    }

    @Test
    void e_getAll() {
        System.out.println("All drivers: "+vehicleRepository.getAll());
    }
}