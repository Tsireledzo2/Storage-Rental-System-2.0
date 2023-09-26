package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Vehicle;
import za.ac.cput.domain.VehicleType;

import static org.junit.jupiter.api.Assertions.*;

class VehicleFactoryTest {
    @Test
    void createVehicleFactory(){
        VehicleType vehicleType = VehicleTypeFactory.buildVehicleType("Truck",1000,700.00);
        Vehicle vehicle = VehicleFactory.buildVehicle("ABC 363","Toyota","Black","2016","Hilux 4x4",vehicleType);
        System.out.println("Vehicle: " +vehicle);
        assertNotNull(vehicle.getNumberPlate());
    }

}