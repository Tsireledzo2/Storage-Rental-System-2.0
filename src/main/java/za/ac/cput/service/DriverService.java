package za.ac.cput.service;

import za.ac.cput.domain.Driver;

import java.util.Set;

public interface DriverService extends IService<Driver,String> {
    public Set<Driver> getAll();
}
