
//package za.ac.cput.repository.impl;
//
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import za.ac.cput.domain.Checkin;
//import za.ac.cput.factory.CheckinFactory;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//class CheckinImplTest {
//
//    private static final CheckinImpl repository = CheckinImpl.getRepository();
//
//    private static final Checkin checkin = CheckinFactory.createCheckin("in","out");
//
//    @Test
//    @Order(1)
//    void create() {
//        Checkin created = repository.create(checkin);
//        assertNotNull(created);
//        assertEquals(checkin.getDriverStatus() , created.getDriverStatus());
//        System.out.println("Create: " + created);
//    }
//
//    @Test
//    @Order(2)
//    void read() {
//        Checkin reading = repository.read(checkin.getDriverStatus());
//        assertNotNull(reading);
//        System.out.println("Read: "+ reading);
//    }
//
//    @Test
//    @Order(3)
//    void update() {
//        Checkin updated = new Checkin.Builder().copy(checkin)
//                .setDriverStatus("out")
//                .setVehicleStatus("in")
//                .build();
//        assertNull(repository.update(updated));
//        System.out.println("Not null: " + updated);
//    }
//
//    @Test
//    @Order(5)
//    void delete() {
//        boolean deleted = repository.delete(checkin.getDriverStatus());
//        assertTrue(deleted);
//        System.out.println("Deleted: " + deleted);
//    }
//
//    @Test
//    @Order(4)
//    void getAll() {
//        System.out.println("Show all: "+ repository.getAll());
//
//    }
//}

