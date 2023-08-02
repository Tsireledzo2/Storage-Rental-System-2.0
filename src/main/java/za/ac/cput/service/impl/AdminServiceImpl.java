/*
AdminServiceImpl.java
This is the AdminServiceImpl class
author : Lithemba Nkqayi(220558558)
Date : 11 June 2023
 */
package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Admin;
import za.ac.cput.repository.IAdminRepository;
import za.ac.cput.service.IAdminService;

import java.util.List;

@Service
public class AdminServiceImpl implements IAdminService{
    private IAdminRepository adminRepository;

    @Autowired
    private AdminServiceImpl(IAdminRepository adminRepository){

        this.adminRepository = adminRepository;
    }
    @Override
    public List<Admin> getAll() {
        return this.adminRepository.findAll();
    }


    @Override
    public Admin create(Admin admin) {
        return this.adminRepository.save(admin);
    }

    @Override
    public Admin read(String adminID) {
        return this.adminRepository.findById(adminID).orElse(null);
    }

    @Override
    public Admin update(Admin admin) {
        if(this.adminRepository.existsById(admin.getAdminID()))
            return this.adminRepository.save(admin);
        return null;
    }

    @Override
    public boolean delete(String adminID) {
        if(this.adminRepository.existsById(adminID)) {
            this.adminRepository.deleteById(adminID);
            return true;
        }
        return false;
    }
}
