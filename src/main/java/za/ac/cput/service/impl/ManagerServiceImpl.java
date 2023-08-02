/*
ManagerServiceImpl.java
This is the ManagerServiceImpl class
author : Lithemba Nkqayi(220558558)
Date : 11 June 2023
 */
package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Manager;
import za.ac.cput.repository.IManagerRepository;
import za.ac.cput.service.IManagerService;

import java.util.List;
@Service
public class ManagerServiceImpl implements IManagerService{
    private IManagerRepository managerRepository;

    @Autowired
    private ManagerServiceImpl(IManagerRepository managerRepository){
        this.managerRepository = managerRepository;
    }
    @Override
    public List<Manager> getAll() {
        return this.managerRepository.findAll();
    }

    @Override
    public Manager create(Manager manager) {
        return this.managerRepository.save(manager);
    }

    @Override
    public Manager read(String managerIndex) {
        return this.managerRepository.findById(managerIndex).orElse(null);
    }

    @Override
    public Manager update(Manager manager) {
        if(this.managerRepository.existsById(manager.getManagerIndex()))
            return this.managerRepository.save(manager);
        return null;
    }

    @Override
    public boolean delete(String managerIndex) {
        if(this.managerRepository.existsById(managerIndex)) {
            this.managerRepository.deleteById(managerIndex);
            return true;
        }
        return false;
    }
}
