

/**
 * MyApplication spring boot application
 * Base code for spring boot
 * 05 Aug 2023
 */

package za.ac.cput;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Role;
import za.ac.cput.domain.RoleName;
import za.ac.cput.repository.ICustomerRepository;
import za.ac.cput.repository.IRoleRepository;
import za.ac.cput.service.ICustomerService;

import java.util.ArrayList;

@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

    @Bean
    CommandLineRunner run (ICustomerService iUserService , IRoleRepository iRoleRepository , ICustomerRepository iUserRepository , PasswordEncoder passwordEncoder)
    {return  args ->
    {   iUserService.saveRole(new Role(RoleName.USER));
        iUserService.saveRole(new Role(RoleName.ADMIN));
        iUserService.saveRole(new Role(RoleName.SUPERADMIN));
        iUserService.create(new Customer.Builder().setEmail("admin@gmail.com").setPassword(passwordEncoder.encode("adminPassword")).build());
        iUserService.create(new Customer("superadminadmin@gmail.com", passwordEncoder.encode("superadminPassword"), new ArrayList<>()));

        Role role = iRoleRepository.findByRoleName(RoleName.ADMIN);
        Customer user = iUserService.getCustomersByEmail("admin@gmail.com");
        //System.out.println("User:"+ user.toString());
        user.getRoles().add(role);
        iUserService.create(user);

        Customer userr = iUserRepository.findByEmail("superadminadmin@gmail.com").orElse(null);
        Role rolee = iRoleRepository.findByRoleName(RoleName.SUPERADMIN);
        userr.getRoles().add(rolee);
        iUserService.create(userr);

    };}
}



