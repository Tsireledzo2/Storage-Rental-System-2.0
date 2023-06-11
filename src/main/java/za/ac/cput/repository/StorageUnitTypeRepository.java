/**
 *  IStorageUnitTypeRepository.java
 * Author Ruvimbo Ndoro 220128871
 * Date 10June 2023
 */



package za.ac.cput.repository;

import za.ac.cput.domain.StorageUnitType;

import java.util.Set;

public interface StorageUnitTypeRepository extends IRepository <StorageUnitType,Double> {
     public Set<StorageUnitType> getAll();

}
