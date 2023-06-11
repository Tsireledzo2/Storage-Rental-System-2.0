package za.ac.cput.repository;

import za.ac.cput.domain.Manager;

import java.util.Set;

public interface IManagerRepository extends IRepository<Manager,String>{
    public Set<Manager> getAll();
}
