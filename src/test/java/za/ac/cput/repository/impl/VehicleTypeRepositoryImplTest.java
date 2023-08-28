package za.ac.cput.repository.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.VehicleType;
import za.ac.cput.factory.VehicleTypeFactory;

import static org.junit.jupiter.api.Assertions.*;
//ar
@TestMethodOrder(MethodOrderer.MethodName.class)
class VehicleTypeRepositoryImplTest {

    private static VehicleTypeRepositoryImpl vehicleTypeRepository = VehicleTypeRepositoryImpl.getVehicleTypeRepository();
    private static VehicleType vehicleType = VehicleTypeFactory.buildVehicleType("Truck",1000,700.00);
    @Test
    void a_create() {
        VehicleType buildVehicle = vehicleTypeRepository.create(vehicleType);
        assertEquals(vehicleType.getVehicleDescription(),buildVehicle.getVehicleDescription());
        System.out.println("Created vehicleType : " +buildVehicle );
    }

    @Test
    void b_read() {
        VehicleType readVehicleType = vehicleTypeRepository.read(vehicleType.getVehicleDescription());
        assertNotNull(readVehicleType);
        System.out.println("VehicleType: " +readVehicleType);

    }

    @Test
    void c_update() {
        VehicleType newVehicleType = new VehicleType.Builder().copy(vehicleType)
                .setVehicleDescription("Bakkie")
                .setCapacity(123)
                .setVehiclePrice(200.00)
                .build();
        assertNotNull(vehicleTypeRepository.update(vehicleType));
        System.out.println("Updated vehicleType: " + newVehicleType);
    }

    @Test
    void d_delete() {
        boolean success = vehicleTypeRepository.delete(vehicleType.getVehicleDescription());
        assertTrue(success);
        System.out.println("deleted");

    }

    @Test
    void e_getAll() {
        System.out.println("All vehicleTypes: "+vehicleTypeRepository.getAll());
    }
}