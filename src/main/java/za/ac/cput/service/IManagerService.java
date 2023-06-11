package za.ac.cput.service;

import za.ac.cput.domain.Manager;

import java.util.Set;

public interface IManagerService extends IService <Manager,String>{
    public Set<Manager>getAll();
}
