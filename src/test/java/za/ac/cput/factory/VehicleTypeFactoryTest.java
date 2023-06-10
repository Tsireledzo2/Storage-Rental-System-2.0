package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.VehicleType;

import static org.junit.jupiter.api.Assertions.*;
class VehicleTypeFactoryTest {
    @Test
    void createVehicleFactory(){
        VehicleType vehicleType = VehicleTypeFactory.buildVehicleType("Truck",1000,700.00);
        System.out.println("Driver: " +vehicleType);
        assertNotNull(vehicleType.getVehicleDescription());
    }
  
}