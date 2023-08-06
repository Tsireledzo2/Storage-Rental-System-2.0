package za.ac.cput.repository;
/*
 * ICheckinRepository.java
 * ICheckinRepository Entity
 * @author: Argus Hakizimana Mbogo (220073260)
 * Date: 09 June 2023
 */

import za.ac.cput.domain.Checkin;

import java.util.Set;

public interface ICheckinRepository extends IRepository<Checkin, String> {
    Set<Checkin> getAll();

}
