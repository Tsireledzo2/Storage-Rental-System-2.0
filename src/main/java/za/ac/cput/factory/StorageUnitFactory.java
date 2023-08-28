/**
 *  StorageUnitFactory.java
 * Author Ruvimbo Ndoro 220128871
 * Date 10June 2023
 */
package za.ac.cput.factory;

import za.ac.cput.domain.StorageUnit;
import za.ac.cput.util.Helper;

public class StorageUnitFactory {
    public static StorageUnit buildStorageUnit(String id, String description ,int height,int length, int width, int unitSize, double price){

        StorageUnit storageUnit = new StorageUnit.Builder()
                .setUnitId(id)
                .setUnitSizeDescription(description)
                .setStorageUnitType(StorageUnitTypeFactory.buildStorageUnitType(height,length,width,unitSize,price))
                .build();

        return storageUnit;
    }
}


