package za.ac.cput.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Role;
import za.ac.cput.domain.RoleName;
import za.ac.cput.dto.BearerToken;
import za.ac.cput.dto.LoginDto;
import za.ac.cput.dto.RegisterDto;
import za.ac.cput.repository.ICustomerRepository;
import za.ac.cput.repository.IRoleRepository;
import za.ac.cput.security.JwtUtilities;
import za.ac.cput.service.ICustomerService;
/*
Ndumiso Nkululeko Ngcobo
220094861
Address Service class
11/06/2023

 */
import java.util.Collections;
import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {
@Autowired
    private ICustomerRepository customerRepository;

@Autowired
    private IRoleRepository iRoleRepository ;

    private JwtUtilities jwtUtilities ;
    private PasswordEncoder passwordEncoder ;

    @Override
    public Customer create(Customer customer) {
        return null;
    }

    @Override
    public Customer read(String s) {
        return null;
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public Customer updateP(Customer customer) {
        if(this.customerRepository.existsById(customer.getEmail())) {
            Customer customer1 = new Customer();
            customer1 = customerRepository.findById(customer.getEmail()).orElse(null);
            customer1.setPassword(customer.getPassword());
            return this.customerRepository.save(customer1);
        }else {
            return null;
        }
    }

    @Override
    public String authenticate(LoginDto loginDto) {
        return null;
    }

    @Override
    public ResponseEntity<?> register(RegisterDto registerDto) {
        if(customerRepository.existsByEmail(registerDto.getEmail()))
        { return  new ResponseEntity<>("email is already taken !", HttpStatus.SEE_OTHER); }
        else
        { Customer customer = new Customer();
            customer.setEmail(registerDto.getEmail());
            customer.setFullName(registerDto.getFullName());
            customer.setCellphone(registerDto.getCellphone());
            customer.setPassword(passwordEncoder.encode(registerDto.getPassword()));
            //By Default , he/she is a simple user
            Role role = iRoleRepository.findByRoleName(RoleName.USER);
            customer.setRoles(Collections.singletonList(role));
            customerRepository.save(customer);
            String token = jwtUtilities.generateToken(registerDto.getEmail(),Collections.singletonList(role.getRoleName()));
            return new ResponseEntity<>(new BearerToken(token , "Bearer "),HttpStatus.OK);

        }
    }

    @Override
    public Role saveRole(Role role) {
        return iRoleRepository.save(role);
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public List<Customer> getAll() {
        return null;
    }

    @Override
    public Customer login(String email, String password) {
        return customerRepository.findByEmailAndPassword(email,password);
    }

    @Override
    public Customer getCustomersByEmail(String email) {
        return customerRepository.getCustomersByEmail(email);
    }

    public void updatePassword(String email, String newPassword) {
        Customer customer = customerRepository.getCustomersByEmail(email);

        if (customer != null) {
            // Update the password
            customer.setPassword(newPassword);
            customerRepository.save(customer);
        } else {
            // Handle the case where the customer with the provided email doesn't exist
            // You can throw an exception or return an appropriate response
           // throw new CustomerNotFoundException("Customer with email " + email + " not found");
        }
    }

//    @Override
//    public Customer updatePass(String email,String password) {
//        if(this.customerRepository.existsById(email))
//            return null;
//        return null;
//    }



}
