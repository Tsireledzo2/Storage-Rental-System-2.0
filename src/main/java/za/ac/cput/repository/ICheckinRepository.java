package za.ac.cput.repository;
/*
 * ICheckinRepository.java
 * ICheckinRepository Entity
 * @author: Argus Hakizimana Mbogo (220073260)
 * Date: 09 June 2023
 */


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Checkin;

import java.util.Set;
@Repository
public interface ICheckinRepository extends JpaRepository<Checkin, String> {

    Set<Checkin> getAll();

}
