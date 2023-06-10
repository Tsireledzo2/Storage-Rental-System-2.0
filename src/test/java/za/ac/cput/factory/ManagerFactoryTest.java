package za.ac.cput.factory;

import org.junit.jupiter.api.Test;

import za.ac.cput.domain.Manager;

import static org.junit.jupiter.api.Assertions.*;

class ManagerFactoryTest {
    @Test
    void createManagerFactory(){
        Manager manager = ManagerFactory.createManager("Lily","Nkqayi","nak@gmail.com","321");
        System.out.println("Manager:" +manager);
        assertNotNull(manager.getFirstName());
    }

}