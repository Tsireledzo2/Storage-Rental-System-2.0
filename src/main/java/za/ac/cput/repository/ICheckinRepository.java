package za.ac.cput.repository;

import za.ac.cput.domain.Checkin;

import java.util.Set;

public interface ICheckinRepository extends IRepository<Checkin, String> {
    Set<Checkin> getAll();

}
