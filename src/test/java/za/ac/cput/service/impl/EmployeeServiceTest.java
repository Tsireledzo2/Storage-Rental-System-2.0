//package za.ac.cput.service.impl;
//
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import za.ac.cput.domain.Employee;
//import za.ac.cput.factory.EmployeeFactory;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//@SpringBootTest
//@TestMethodOrder(MethodOrderer.MethodName.class)
//class EmployeeServiceTest {
//    @Autowired
//    EmployeeService employeeService;
//    private Employee employeeNumber = EmployeeFactory.buildEmployee("A1234","bubu","baba","nk@gmail.com","232");
//
//    @Test
//    void a_create(){
//        Employee create = employeeService.create(employeeNumber);
//        assertEquals(employeeNumber.getEmployeeNumber(), create.getEmployeeNumber());
//        System.out.println("Created employee:" +create);
//    }
//
//   @Test
//   void b_read(){
//        Employee read = employeeService.read(employeeNumber.getEmployeeNumber());
//        assertNotNull(read);
//        System.out.println("Employee read:" +read);
//
//   }
//    @Test
//    void f_delete() {
////      employeeService.delete(employee.getEmployeeNumber());
////
////        List<Employee>employees;
////        employees = employeeService.getAll();
////
////        assertFalse(employees.contains(employee));
//    }
//    @Test
//    void c_findEmployeeByEmployeeNumber() {
//        final String employeeNumber = "Admin";
//        System.out.println("Get all employees" +" "+employeeNumber);
//        System.out.println(employeeService.findEmployeeByEmployeeNumber(employeeNumber));
//    }
//    @Test
//    void e_getAll() {
//        List<Employee> employees;
//        employees = employeeService.getAll();
//        System.out.println(employees);
//        assertNotNull(employees);
//    }
//}