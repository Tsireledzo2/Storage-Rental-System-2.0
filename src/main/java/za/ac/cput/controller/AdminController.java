/*
AdminController.java
This is the AdminController class
author : Lithemba Nkqayi(220558558)
Date : 22 August 2023
 */
package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Admin;
import za.ac.cput.service.impl.AdminServiceImpl;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminServiceImpl adminService;
    @PostMapping("/createAdmin")
    public Admin create(@RequestBody Admin admin) {
        return adminService.create(admin);
    }

    @GetMapping("/getAdmin/{adminID}")
    public Admin read(@PathVariable String adminID) {
        return adminService.read(adminID);
    }

    @PostMapping("/updateAdmin")
    public Admin update(@RequestBody Admin admin) {
        return adminService.update(admin);
    }

    @DeleteMapping("/deleteAdmin/{adminID}")
    public boolean delete(@PathVariable String adminID) {
        return adminService.delete(adminID);
    }

    @GetMapping("/getAllAdmins")
    public List<Admin> getAll() {
        return adminService.getAll();
    }
}
