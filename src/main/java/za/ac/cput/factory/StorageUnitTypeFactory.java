
/**
 *  StorageUnitTypeFactory.java
 * Author Ruvimbo Ndoro 220128871
 * Date 10June 2023
 */

package za.ac.cput.factory;

import za.ac.cput.domain.StorageUnit;
import za.ac.cput.domain.StorageUnitType;

public class StorageUnitTypeFactory {


    public static StorageUnitType buildStorageUnitType(int height, int length, int width, int unitSize, double price) {

        StorageUnitType storageUnitType = new StorageUnitType.Builder()
                .setHeight(height)
                .setLength(length)
                .setWidth(width)
                .setUnitSize(unitSize)
                .setPrice(price)
                .build();
        return storageUnitType;
    }
}

