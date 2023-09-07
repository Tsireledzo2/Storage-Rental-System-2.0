/*
EmployeeService.java
This is the EmployeeService class
author : Lithemba Nkqayi(220558558)
Date : 28 July 2023
 */

package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Admin;
import za.ac.cput.domain.Driver;
import za.ac.cput.domain.Employee;
import za.ac.cput.repository.IAdminRepository;
import za.ac.cput.repository.IDriverRepository;
import za.ac.cput.repository.IEmployeeRepository;
import za.ac.cput.service.IEmployeeService;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    private IEmployeeRepository IEmployeeRepository;
    private IDriverRepository driverRepository;
    private IAdminRepository adminRepository;

    @Autowired
    private EmployeeService(IEmployeeRepository IEmployeeRepository,IDriverRepository driverRepository,IAdminRepository adminRepository){
        this.IEmployeeRepository = IEmployeeRepository;
        this.driverRepository = driverRepository;
        this.adminRepository =  adminRepository;
    }
    @Override
    public List<Employee> getAll() {
        return this.IEmployeeRepository.findAll();
    }

    @Override
    public Employee findByEmail(String email,String password) {
        return IEmployeeRepository.findByEmailAndPassword(email,password);
    }


    @Override
    public Employee create(Employee employee) {
        return this.IEmployeeRepository.save(employee);
    }

    @Override
    public Employee read(String employeeNumber) {
        return this.IEmployeeRepository.findById(employeeNumber).orElse(null);
    }

    @Override
    public Employee update(Employee employee) {
        if(this.IEmployeeRepository.existsById(employee.getEmployeeNumber()))
            return this.IEmployeeRepository.save(employee);
        return null;
    }

    @Override
    public boolean delete(String employeeNumber) {
        if(this.IEmployeeRepository.existsById(employeeNumber)) {
            this.IEmployeeRepository.deleteById(employeeNumber);
            return true;
        }
        return false;
    }

    public Object findEmployeeByEmployeeNumber(String employeeNumber) {
        // Try to find the employee in the Driver table
        Driver driver = driverRepository.findByEmployee_EmployeeNumber(employeeNumber);
        if (driver != null) {
            return driver; // Return the Driver entity
        }

        // If not found in Driver, try to find in Admin table
        Admin admin = adminRepository.findByEmployee_EmployeeNumber(employeeNumber);
        if (admin != null) {
            return admin; // Return the Admin entity
        }

        // If not found in either table, return null or throw an exception as needed
        return null;
    }
}