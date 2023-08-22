/**
 * DriverServiceImpl.java
 * Class for the DriverServiceImpl
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 06 June 2023
 */
package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Driver;
import za.ac.cput.repository.IDriverRepository;
import za.ac.cput.service.DriverService;

import java.util.List;
@Service
public class DriverServiceImpl implements DriverService {
    private static IDriverRepository driverRepository;

    @Autowired
    private DriverServiceImpl(IDriverRepository driverRepository){
        this.driverRepository = driverRepository;
    }

    @Override
    public Driver create(Driver driver) {
        return this.driverRepository.save(driver);
    }

    @Override
    public Driver read(String licenceNumber) {
        return this.driverRepository.findById(licenceNumber).orElse(null);
    }

    @Override
    public Driver update(Driver driver) {
        if(this.driverRepository.existsById(driver.getLicence_number()))
            return this.driverRepository.save(driver);
        return null;
    }

    @Override
    public boolean delete(String licenceNumber) {
        if(this.driverRepository.existsById(licenceNumber)) {
            this.driverRepository.deleteById(licenceNumber);
            return true;
        }
        return false;
    }
    @Override
    public List<Driver> getAll() {
        return this.driverRepository.findAll();
    }
}
