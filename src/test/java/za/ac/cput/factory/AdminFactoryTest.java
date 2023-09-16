package za.ac.cput.factory;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Admin;
import za.ac.cput.domain.Employee;

import static org.junit.jupiter.api.Assertions.*;

class AdminFactoryTest {
    @Test
    void createAdmin(){
        Employee employee = EmployeeFactory.buildEmployee("E124","Lithemba","Nkqayi","lithe@gmail.com","Nkqa$15");
        Admin admin = AdminFactory.createAdmin("123","Admin",employee);
        System.out.println("Admin" +admin);
        assertNotNull(admin.getAdminID());
    }
}