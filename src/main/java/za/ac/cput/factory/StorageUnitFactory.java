package za.ac.cput.factory;

import za.ac.cput.domain.StorageUnit;
import za.ac.cput.util.Helper;

public class StorageUnitFactory {


    public static StorageUnit createStorageUnit(String unitSizeDescription) {

        String unitId = Helper.generateId();

        return new StorageUnit.Builder().setUnitId(unitId)
                .setUnitSizeDescription(unitSizeDescription)

                .build();

    }
}