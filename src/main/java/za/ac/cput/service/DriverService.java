/**
 * DriverService.java
 * Interface for the DriverService
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 06 June 2023
 */
package za.ac.cput.service;

import za.ac.cput.domain.Driver;

import java.util.*;

public interface DriverService extends IService<Driver,String> {
    public List<Driver> getAll();
}
