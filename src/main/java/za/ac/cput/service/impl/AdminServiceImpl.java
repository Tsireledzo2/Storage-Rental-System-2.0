/*
AdminServiceImpl.java
This is the AdminServiceImpl class
author : Lithemba Nkqayi(220558558)
Date : 11 June 2023
 */
package za.ac.cput.service.impl;

import za.ac.cput.domain.Admin;
import za.ac.cput.service.IAdminService;
import za.ac.cput.repository.impl.AdminImpl;
import java.util.Set;

public class AdminServiceImpl implements IAdminService{
    private static AdminServiceImpl adminService = null;
    private static AdminImpl adminRepository = null;
    private AdminServiceImpl(){
        adminRepository = AdminImpl.getAdminRepository();
    }
    @Override
    public Set<Admin> getAll() {
        return adminRepository.getAll();
    }

    @Override
    public Admin create(Admin admin) {
        Admin created = adminRepository.create(admin);
        return created;
    }

    @Override
    public Admin read(String adminID) {
        Admin readAdmin = adminRepository.read(adminID);
        return readAdmin;
    }

    @Override
    public Admin update(Admin admin) {
        Admin updateAdmin = adminRepository.update(admin);
        return updateAdmin;
    }

    @Override
    public boolean delete(String adminID) {
        boolean success = adminRepository.delete(adminID);
        return success;
    }
}
