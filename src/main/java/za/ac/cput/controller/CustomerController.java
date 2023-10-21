package za.ac.cput.controller;
/*
Ndumiso Nkululeko Ngcobo
24/08/2023
220094861
Customer Controller Class
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Employee;
import za.ac.cput.dto.RegisterDto;
import za.ac.cput.repository.ICustomerRepository;
import za.ac.cput.service.impl.CustomerServiceImpl;


@RestController
@RequestMapping("/customer")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {
    @Autowired
    private ICustomerRepository customerRepository;
    @Autowired
    private CustomerServiceImpl customerService;


@Autowired
    public CustomerController (@RequestBody ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;

    }
    @PostMapping("/saveCustomer")
    public Customer createCustomer(@RequestBody Customer customer){
    return customerRepository.save(customer);

    }

    @GetMapping("/login/{email}/{password}")
    public Customer findByEmail(@PathVariable String email, @PathVariable String password){
        return customerService.login(email, password);
    }

    @PostMapping("/update")
    public Customer Resetpassword(@RequestBody Customer customer){
    return customerService.updateP(customer);
    }

    @PostMapping("/register")
    public ResponseEntity<?> register (@RequestBody RegisterDto registerDto)
    { return  customerService.register(registerDto);}

}
