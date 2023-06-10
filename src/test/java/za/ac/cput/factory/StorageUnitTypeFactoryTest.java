/**
 *  StorageUnitTypeFactoryTest.java
 * Author Ruvimbo Ndoro 220128871
 * Date 10June 2023
 */


package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.StorageUnit;
import za.ac.cput.domain.StorageUnitType;

import static org.junit.jupiter.api.Assertions.*;

class StorageUnitTypeFactoryTest {

    @Test
    void createStorageUnitTypeFactory(){
        StorageUnitType storageUnitType = StorageUnitTypeFactory.createStorageUnitType(1.6,5.4,7.7,9,8.5 );
        System.out.println("StorageUnitType: " +storageUnitType);
        assertNotNull(storageUnitType.getLength());
    }
}