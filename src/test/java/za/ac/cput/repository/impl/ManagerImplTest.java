package za.ac.cput.repository.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Manager;
import za.ac.cput.factory.ManagerFactory;
@TestMethodOrder(MethodOrderer.MethodName.class)
class ManagerImplTest {
    private static ManagerImpl managerRepository =ManagerImpl.getManagerRepository();
    private static Manager manager = ManagerFactory.createManager("Lilz","Nkqayi","lee@gmail.com","334");

    @Test
    void a_create(){
     Manager createManager = managerRepository.create(manager);
     assertEquals(manager.getManagerID(), createManager.getManagerID());
        System.out.println("Created manger: " +createManager);
    }
    @Test
    void b_read(){
        Manager readManager = managerRepository.read(manager.getManagerID());
        assertNotNull(readManager);
        System.out.println("Manager: " +readManager);
    }
    @Test
    void c_update(){
        Manager newManager = new Manager.Builder().copy(manager)
                .setFirstName("Stranger")
                .setLastName("Kanye")
                .setEmail("west@gmail.com")
                .setPassword("Kwakho")
                .build();
        assertNotNull(managerRepository.update(manager));
        System.out.println("Updated manager: " +newManager);

    }
    @Test
    void d_delete(){
        boolean success = managerRepository.delete(manager.getManagerID());
        assertTrue(success);
        System.out.println("deleted");
    }
   @Test
    void e_getAll(){
       System.out.println("All Managers: " +managerRepository.getAll());
   }
}