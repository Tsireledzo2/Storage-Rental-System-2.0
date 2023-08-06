package za.ac.cput.service.impl;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.StorageUnit;
import za.ac.cput.factory.StorageUnitFactory;

import static org.junit. jupiter.api.Assertions.*;

class StorageUnitServiceImplTest {

    private static StorageUnitServiceImpl service = null;
    private static StorageUnit storageUnit = StorageUnitFactory.createStorageUnit("small");
    public StorageUnitServiceImplTest(){

        service = StorageUnitServiceImpl.getStorageUnitService();
    }

    @Test
    void a_create() {
        StorageUnit created = service.create(storageUnit);
        assertNotNull(created);
        System.out.println(created);

    }
    @Test
    void d_read(){
        StorageUnit read = service.read(storageUnit.getUnitId());
        assertNotNull(read);
        System.out.println(read);


        }

    @Test
    void d_delete() {
        boolean success = service.delete(storageUnit.getUnitId());
        assertTrue(success);
        System.out.println("deleted:" + success);
    }
    @Test
    void e_getAll() {

        System.out.println("Show All");
        System.out.println(service.getAll());
    }
}


