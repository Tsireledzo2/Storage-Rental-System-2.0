///**
// * DriverRepositoryImplTest.java
// * Test Class for the DriverRepositoryImplTest
// * @author: Tsireledzo Wisdom Makhado (221116273)
// * Date: 06 June 2023
// */
//package za.ac.cput.repository.impl;
//
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import za.ac.cput.domain.Driver;
//import za.ac.cput.factory.DriverFactory;
//
//import static org.junit.jupiter.api.Assertions.*;
//@TestMethodOrder(MethodOrderer.MethodName.class)
//class DriverRepositoryImplTest {
//
//    private static  DriverRepositoryImpl driverRepository = DriverRepositoryImpl.getDriverRepository();
//    private static Driver driver = DriverFactory.buildDriver("Tsireledzo","Makhado","tsire@gmail.com","123456");
//    private static Driver driver2 = DriverFactory.buildDriver("Wisdom","Khados","khados@gmail.com","3466433");
//
//
//    @Test
//    void a_create() {
//        Driver createDriver = driverRepository.create(driver);
//        Driver createDriver2 = driverRepository.create(driver2);
//        assertNotEquals(createDriver.getLicenceNumber(),createDriver2.getLicenceNumber());
//        assertEquals(createDriver,driver);
//        assertEquals(createDriver2,driver2);
//        System.out.println(createDriver +"\n" +createDriver2);
//    }
//
//    @Test
//    void b_read() {
//        Driver readDriver = driverRepository.read(driver.getLicenceNumber());
//        assertEquals(readDriver,driver);
//        System.out.println(readDriver);
//    }
//    @Test
//    void c_update() {
//        Driver updateDriver = new Driver.Builder().copy(driver)
//                .setEmail("makhado@gmail.com")
//                .setPassword("makhado12345")
//                .build();
//        assertNotNull(driverRepository.update(driver));
//        System.out.println(updateDriver);
//    }
//
//    @Test
//    void d_delete() {
//        boolean success = driverRepository.delete(driver.getLicenceNumber());
//        assertTrue(success);
//        System.out.println("deleted");
//    }
//
//    @Test
//    void e_getAll() {
//        System.out.println("All drivers: "+driverRepository.getAll());
//    }
//}