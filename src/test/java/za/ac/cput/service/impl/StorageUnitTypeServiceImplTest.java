package za.ac.cput.service.impl;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.StorageUnitType;
import za.ac.cput.factory.StorageUnitTypeFactory;
import static org.junit.jupiter.api.Assertions.*;

class StorageUnitTypeServiceImplTest {
    private static StorageUnitTypeServiceImpl service = null;
    private static StorageUnitType storageUnitType = StorageUnitTypeFactory.createStorageUnitType(4.5,8.6,6.5,9,1.5);
    public StorageUnitTypeServiceImplTest(){
        service = StorageUnitTypeServiceImpl.getService();
    }

    @Test
    void a_create() {
        StorageUnitType created = service.create(storageUnitType);
        assertNotNull(created);
        System.out.println(created);


    }
    @Test
    void d_read(){
        StorageUnitType read = service.read(storageUnitType.getLength());
        assertNotNull(read);
        System.out.println(read);

    }


    @Test
    void d_delete() {
        boolean success = service.delete(storageUnitType.getLength());
        assertTrue(success);
        System.out.println("deleted:" + success);
    }
    @Test
    void e_getAll() {

        System.out.println("Show All");
        System.out.println(service.getAll());
    }
}




