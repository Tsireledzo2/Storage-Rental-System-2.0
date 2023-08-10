/*
IManagerService.java
This is the IManagerService class
author : Lithemba Nkqayi(220558558)
Date : 11 June 2023
 */
package za.ac.cput.service;

import za.ac.cput.domain.Manager;

import java.util.List;
import java.util.Set;

public interface IManagerService extends IService <Manager,String>{
    public List<Manager> getAll();

}
