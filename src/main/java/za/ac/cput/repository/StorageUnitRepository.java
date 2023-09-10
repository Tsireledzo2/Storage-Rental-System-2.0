
/**
 *  IStorageUnitRepository.java
 * Author Ruvimbo Ndoro 220128871
 * Date 10June 2023
 */


package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import za.ac.cput.domain.StorageUnit;

import java.util.List;
import java.util.Set;

public interface StorageUnitRepository extends JpaRepository<StorageUnit, String> {
    @Query("SELECT su FROM StorageUnit su WHERE su.unitSizeDescription = :description")
    List<StorageUnit> findByDescription(@Param("description") String description);
}




