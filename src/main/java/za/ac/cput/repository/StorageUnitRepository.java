
/**
 *  IStorageUnitRepository.java
 * Author Ruvimbo Ndoro 220128871
 * Date 10June 2023
 */


package za.ac.cput.repository;

import za.ac.cput.domain.StorageUnit;

import java.util.Set;

public interface StorageUnitRepository extends IRepository <StorageUnit, String> {


    public Set<StorageUnit> getAll();
}




