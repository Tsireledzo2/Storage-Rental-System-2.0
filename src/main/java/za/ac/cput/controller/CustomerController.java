package za.ac.cput.controller;
/*
Ndumiso Nkululeko Ngcobo
24/08/2023
220094861
Customer Controller Class
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Customer;
import za.ac.cput.repository.ICustomerRepository;


@RestController
@RequestMapping("/customer")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {
    @Autowired
    private ICustomerRepository customerRepository;


@Autowired
    public CustomerController (@RequestBody ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;

    }
    @PostMapping("/saveCustomer")
    public Customer createCustomer(@RequestBody Customer customer){
    return customerRepository.save(customer);

    }
}
