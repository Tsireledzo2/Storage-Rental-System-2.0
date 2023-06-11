package za.ac.cput.service;

import za.ac.cput.domain.StorageUnit;
import za.ac.cput.domain.StorageUnitType;

import java.util.Set;

public interface StorageUnitTypeService extends IService <StorageUnitType, Double>{

    public Set<StorageUnitType> getAll();
}
