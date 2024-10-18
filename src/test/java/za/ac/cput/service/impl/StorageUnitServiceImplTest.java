//package za.ac.cput.service.impl;
//
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import za.ac.cput.domain.StorageUnit;
//import za.ac.cput.factory.StorageUnitFactory;
//
//import static org.junit. jupiter.api.Assertions.*;
//@TestMethodOrder(MethodOrderer.MethodName.class)
//@SpringBootTest
//class StorageUnitServiceImplTest {
//
//
//
//    private StorageUnitServiceImpl service;
//    private static StorageUnit storageUnit = StorageUnitFactory.buildStorageUnit("956986", "Spacious", 9, 6,7,5,1000);
//
//
//    @Test
//    void a_create() {
//        StorageUnit created  = service.create(storageUnit);
//        assertEquals(storageUnit.getUnitId(), created.getUnitId());
//        System.out.println("Created"+ created);
//
//    }
//    @Test
//    void d_read(){
//        StorageUnit read = service.read(storageUnit.getUnitId());
//        assertNotNull(read);
//        System.out.println("Read"+ read);
//
//
//        }
//
//    @Test
//    void c_update() {
//       StorageUnit newStorageUnit = new StorageUnit.Builder().copy(storageUnit).setUnitSizeDescription("Small").build();
//        StorageUnit updated = service.update(newStorageUnit);
//        assertEquals(newStorageUnit.getUnitSizeDescription(), updated.getUnitSizeDescription());
//        System.out.println("Updated" + updated);
//    }
//
//    @Test
//    @Disabled
//    void e_delete() {
//
//    }
//    @Test
//    void d_getAll() {
//        System.out.println("Get All");
//        System.out.println(service.getAll());
//    }
//}
//
//
