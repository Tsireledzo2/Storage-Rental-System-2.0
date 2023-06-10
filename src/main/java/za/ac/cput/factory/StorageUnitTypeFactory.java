package za.ac.cput.factory;

import za.ac.cput.domain.StorageUnit;
import za.ac.cput.domain.StorageUnitType;

public class StorageUnitTypeFactory {

    //ar
    public static StorageUnitType createStorageUnitType(double length, double width, double height, int unitSize, double price) {


        return new StorageUnitType.Builder().setLength(length)
                .setLength(length)
                .setWidth(width)
                .setHeight(height)
                .setUnitSize(unitSize)
                .setPrice(price)
                .build();

    }
}

