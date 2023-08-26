/*
EmployeeService.java
This is the EmployeeService class
author : Lithemba Nkqayi(220558558)
Date : 28 July 2023
 */

package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Employee;
import za.ac.cput.repository.IEmployeeRepository;
import za.ac.cput.service.IEmployeeService;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    private IEmployeeRepository IEmployeeRepository;

    @Autowired
    private EmployeeService(IEmployeeRepository IEmployeeRepository){
        this.IEmployeeRepository = IEmployeeRepository;
    }
    @Override
    public List<Employee> getAll() {
        return this.IEmployeeRepository.findAll();
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
}