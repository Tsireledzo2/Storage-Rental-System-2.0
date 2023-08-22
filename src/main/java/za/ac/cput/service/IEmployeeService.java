/*
IEmployeeService.java
This is the IEmployeeService class
author : Lithemba Nkqayi(220558558)
Date : 11 June 2023
 */

package za.ac.cput.service;

import za.ac.cput.domain.Employee;

import java.util.List;

public interface IEmployeeService extends IService<Employee,String> {
    public List<Employee> getAll();
}

