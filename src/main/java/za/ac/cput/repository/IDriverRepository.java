package za.ac.cput.repository;

import za.ac.cput.domain.Driver;

import java.util.Set;

public interface IDriverRepository extends IRepository<Driver,String> {
    public Set<Driver> getAll();
}
