//package za.ac.cput.service.impl;
//
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import za.ac.cput.domain.Admin;
//import za.ac.cput.domain.Employee;
//import za.ac.cput.factory.AdminFactory;
//import za.ac.cput.factory.EmployeeFactory;
//
//import static org.junit.jupiter.api.Assertions.*;
//@SpringBootTest
//@TestMethodOrder(MethodOrderer.MethodName.class)
//class AdminServiceImplTest {
//    @Autowired
//    EmployeeService employeeService;
//    @Autowired
//    AdminServiceImpl adminService;
//
//    public Employee employee = EmployeeFactory.buildEmployee("A12345","Lee","Yona","yon@gmail.com","$234");
//    public Admin admin = AdminFactory.createAdmin("123","Admin",employee);
//
//    @Test
//    void e_getAll() {
//    }
//
//    @Test
//    void a_create() {
//        Employee employee1 = employeeService.create(employee);
//        Admin admin1 =adminService.create(admin);
//        assertNotNull(employee1);
//        assertNotNull(admin1);
//        assertEquals("Admin", admin1.getJob_description());
//    }
//
//    @Test
//    void b_read() {
//        Admin admin1 = adminService.read(admin.getAdminID());
//        assertNotNull(admin1);
//        assertEquals(admin1.getAdminID(),admin.getAdminID());
//    }
//
//    @Test
//    void update() {
//    }
//
//    @Test
//    void delete() {
//    }
//}