package za.ac.cput.service.impl;

import za.ac.cput.domain.Driver;
import za.ac.cput.repository.impl.DriverRepositoryImpl;
import za.ac.cput.service.DriverService;

import java.util.Set;

public class DriverServiceImpl implements DriverService {
    private static DriverServiceImpl driverService = null;
    private static DriverRepositoryImpl driverRepository = null;

    private DriverServiceImpl(){

        driverRepository = DriverRepositoryImpl.getDriverRepository();
    }

    public static DriverServiceImpl getDriverService(){
        if(driverService ==null){
            driverService = new DriverServiceImpl();
        }
        return driverService;
    }



    @Override
    public Driver create(Driver driver) {
        Driver createDriver = driverRepository.create(driver);
        return createDriver;
    }

    @Override
    public Driver read(String licenceNumber) {
        Driver readDriver = driverRepository.read(licenceNumber);
        return readDriver;
    }

    @Override
    public Driver update(Driver driver) {
        Driver updateDriver = driverRepository.update(driver);
        return updateDriver;
    }

    @Override
    public boolean delete(String licenceNumber) {
        boolean success = driverRepository.delete(licenceNumber);
        return success;
    }
    @Override
    public Set<Driver> getAll() {
        return driverRepository.getAll();
    }
}
