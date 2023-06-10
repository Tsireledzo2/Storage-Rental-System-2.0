package za.ac.cput.repository;

import za.ac.cput.domain.Admin;

import java.util.Set;

public interface IAdminRepository extends IRepository<Admin,String>{
    public Set<Admin> getAll();
}
