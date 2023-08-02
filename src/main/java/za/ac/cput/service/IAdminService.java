/*
IAdminService.java
This is the IAdminService class
author : Lithemba Nkqayi(220558558)
Date : 11 June 2023
 */
package za.ac.cput.service;

import za.ac.cput.domain.Admin;

import java.util.List;
import java.util.Set;

public interface IAdminService extends IService <Admin,String>{
    public List<Admin> getAll();
}
