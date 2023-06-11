/*
IManagerRepository.java
This is the IManagerRepository class
author : Lithemba Nkqayi(220558558)
Date : 11 June 2023
 */
package za.ac.cput.repository;

import za.ac.cput.domain.Manager;

import java.util.Set;

public interface IManagerRepository extends IRepository<Manager,String>{
    public Set<Manager> getAll();
}
