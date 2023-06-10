/**
 *  IStorageUnitTypeRepository.java
 * Author Ruvimbo Ndoro 220128871
 * Date 10June 2023
 */



package za.ac.cput.repository;

import za.ac.cput.domain.StorageUnitType;
import za.ac.cput.repository.impl.StorageUnitRepository;

import java.util.Set;

public interface IStorageUnitTypeRepository extends IRepository <StorageUnitType,Double> {
     public Set<StorageUnitType> getAll();

}
