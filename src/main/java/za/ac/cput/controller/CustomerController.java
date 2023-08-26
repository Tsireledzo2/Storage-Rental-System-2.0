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
import za.ac.cput.factory.CustomerFactory;
import za.ac.cput.service.ICustomerService;

import java.util.List;

@RestController
public class CustomerController {
@Autowired
    private ICustomerService customerService;

@PostMapping("/create")
public Customer create(@RequestBody Customer customer){
     Customer newCustomer = CustomerFactory.createCustomer(customer.getFirstName(), customer.getLastName(), customer.getPhone(), customer.getEmail());
     return customerService.create(newCustomer);
}

@GetMapping("/read/{id}")
    public Customer read(@PathVariable String id){
    return customerService.read(id);
}

@PostMapping("/update")
    public Customer update(@RequestBody Customer customer){
    return customerService.update(customer);
}

@GetMapping("/getall")
    public List<Customer> getAll(){
    return customerService.getAll();
}

   @DeleteMapping("/delete/{id}")
   public boolean delete(@PathVariable String id){
    return customerService.delete(id);
   }
}
