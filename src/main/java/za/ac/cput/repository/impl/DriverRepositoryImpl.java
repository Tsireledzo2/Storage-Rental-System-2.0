package za.ac.cput.repository.impl;

import za.ac.cput.domain.Driver;
import za.ac.cput.factory.DriverFactory;
import za.ac.cput.repository.IDriverRepository;

import java.util.HashSet;
import java.util.Set;

public class DriverRepositoryImpl implements IDriverRepository {

    private static DriverRepositoryImpl driverRepository = null;
    private Set<Driver> driverDB = null;

    public DriverRepositoryImpl() {
        driverDB = new HashSet<Driver>();
    }
    public DriverRepositoryImpl getDriverRepository(){
        if(driverRepository==null){
            driverRepository = new DriverRepositoryImpl().getDriverRepository();
        }
        return driverRepository;
    }


    @Override
    public Driver create(Driver driver) {
        boolean success = driverDB.add(driver);
        if(!success){
            return null;
        }
        return driver;
    }

    @Override
    public Driver read(String licenceNumber) {
        Driver readDriver = driverDB.stream().filter(driver -> driver.getLicenceNumber().equals(licenceNumber))
                .findAny().orElse(null);
        return readDriver;
    }

    @Override
    public Set<Driver> getAll() {
        return driverRepository.getAll();
    }

    @Override
    public Driver update(Driver driver) {
        Driver oldDriver = driverRepository.read(driver.getLicenceNumber());
        if(oldDriver==null){
            return null;
        }
        driverDB.remove(oldDriver);
        driverDB.add(driver);
        return driver;
    }

    @Override
    public boolean delete(String licenceNumber) {
        Driver deleteDriver = driverRepository.read(licenceNumber);
        if(deleteDriver==null)
            return false;

        driverDB.remove(deleteDriver);
        return true;

    }
}
