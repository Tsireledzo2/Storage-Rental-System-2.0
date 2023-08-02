/*
IManagerRepository.java
This is the IManagerRepository class
author : Lithemba Nkqayi(220558558)
Date : 11 June 2023
 */
package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.Manager;
import java.util.List;


public interface IManagerRepository extends JpaRepository<Manager,String> {
    public List<Manager> getAll();
}
