/*
IAdminRepository.java
This is the IAdminRepository class
author : Lithemba Nkqayi(220558558)
Date : 11 June 2023
 */
package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.Admin;

import java.util.List;
import java.util.Set;
public interface IAdminRepository extends JpaRepository<Admin,String> {
    public List<Admin> getAll();
}
