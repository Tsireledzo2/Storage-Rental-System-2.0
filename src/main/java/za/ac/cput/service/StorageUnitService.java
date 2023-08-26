package za.ac.cput.service;

import za.ac.cput.domain.StorageUnit;

import java.util.List;
import java.util.Set;

public interface StorageUnitService {
    StorageUnit create (StorageUnit storageUnit);

    StorageUnit read (String UnitId);

    boolean delete (String UnitId);

    public List<StorageUnit> getAll();
}
