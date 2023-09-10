package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Admin;

import static org.junit.jupiter.api.Assertions.*;

class AdminFactoryTest {
    @Test
    void createAdminFactory(){
        Admin admin = AdminFactory.createAdmin("Lithemba","Nkqayi","lil@gmail.com","534");
        System.out.println("Admin:" +admin);
        assertNotNull(admin.getFirstName());
    }

}