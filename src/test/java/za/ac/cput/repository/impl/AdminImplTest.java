package za.ac.cput.repository.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Admin;
import za.ac.cput.factory.AdminFactory;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class AdminImplTest {
    private static AdminImpl adminRepository = AdminImpl.getAdminRepository();
    private static Admin admin = AdminFactory.createAdmin("Othe","Mqoma","ot@gmail.com","432");

    @Test
    void a_create(){
        Admin createAdmin = adminRepository.create(admin);
        assertEquals(admin.getAdminID(),createAdmin.getAdminID());
        System.out.println("Created admin:" +createAdmin);
    }
    @Test
    void b_read(){
        Admin readAdmin = adminRepository.read(admin.getAdminID());
        assertNotNull(readAdmin);
        System.out.println("Admin: " +readAdmin);
    }
    @Test
    void c_update(){
       Admin newAdmin = new Admin.Builder().copy(admin)
               .setFirstName("Letsie")
               .setLastName("Kelvin")
               .setEmail("kelv@gmail.com")
               .setPassword("3241")
               .build();
       assertNotNull(adminRepository.update(admin));
        System.out.println("Updated Admin: " +newAdmin);
    }
    @Test
    void d_update(){
      boolean success = adminRepository.delete(admin.getAdminID());
      assertTrue(success);
        System.out.println("deleted");
    }
    @Test
    void e_getAll(){
        System.out.println("All admins: " +adminRepository.getAll());
    }

}