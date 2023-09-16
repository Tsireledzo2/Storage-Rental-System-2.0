/*
EmployeeController.java
This is the EmployeeController class
author : Lithemba Nkqayi(220558558)
Date : 22 August 2023
 */
package za.ac.cput.controller;

import za.ac.cput.domain.Employee;
import za.ac.cput.service.impl.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @PostMapping("/createEmployee")
    public Employee create(@RequestBody Employee employee){
        return employeeService.create(employee);
    }

    @GetMapping("/getEmployee/{employeeNumber}")
    public Employee read(@PathVariable String employeeNumber){
        return employeeService.read(employeeNumber);
    }

    @PostMapping("/updateEmployee")
    public Employee update(@RequestBody Employee employee){
        return employeeService.update(employee);
    }

    @DeleteMapping("/deleteEmployee/{employeeNumber}")
    public boolean delete(@PathVariable String employeeNumber){
        return employeeService.delete(employeeNumber);
    }

    @GetMapping("/getAllEmployee")
    public List<Employee> getAll(){
        return employeeService.getAll();
    }

    @GetMapping("/login/{employeeEmail}/{password}")
    public Employee findByEmail(@PathVariable String employeeEmail,@PathVariable String password){
        return employeeService.findByEmail(employeeEmail,password);
    }

    @GetMapping("/DriverAdminLogin/{employeeNumber}")
    public Object findAdminOrDriver(@PathVariable String employeeNumber) {
        return  employeeService.findEmployeeByEmployeeNumber(employeeNumber);
    }
}
