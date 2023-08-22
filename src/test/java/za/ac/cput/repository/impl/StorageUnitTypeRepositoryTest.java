package za.ac.cput.repository.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.StorageUnitType;
import za.ac.cput.factory.StorageUnitTypeFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class StorageUnitTypeRepositoryTest {

    private static StorageUnitTypeRepositoryImpl storageUnitTypeRepository = StorageUnitTypeRepositoryImpl.getStorageUnitTypeRepository();
    private static StorageUnitType storageUnitType = StorageUnitTypeFactory.createStorageUnitType(5.6, 9.0, 6.8, 3, 7.5);


    @Test
    void a_create() {
        StorageUnitType createStorageUnitType = storageUnitTypeRepository.create(storageUnitType);
        assertEquals(storageUnitType.getLength(), createStorageUnitType.getLength());
        System.out.println("Created storageUnitType : " + createStorageUnitType);
    }


    @Test
    void b_read() {
        StorageUnitType readStorageUnitType = storageUnitTypeRepository.read(storageUnitType.getLength());
        assertNotNull(readStorageUnitType);
        System.out.println("StorageUnitType: " + readStorageUnitType);

    }

    @Test
    void c_update() {
        StorageUnitType newStorageUnitType = new StorageUnitType.Builder().copy(storageUnitType)
                .setLength(6.9)
                .setWidth(12.8)
                .setHeight(34.0)
                .setUnitSize(434)
                .setPrice(34.0)

                .build();
        assertNotNull(storageUnitTypeRepository.update(storageUnitType));
        System.out.println("Updated storageUnitType: " + newStorageUnitType);
    }

    @Test
    void d_delete() {
        boolean success = storageUnitTypeRepository.delete(storageUnitType.getLength());
        assertTrue(success);
        System.out.println("deleted");
    }

    @Test
    void e_getAll() {
        System.out.println("All storageUnitTypes: "+storageUnitTypeRepository.getAll());
    }
}



