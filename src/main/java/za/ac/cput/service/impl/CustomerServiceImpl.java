package za.ac.cput.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Customer;
import za.ac.cput.repository.ICustomerRepository;
import za.ac.cput.service.ICustomerService;
/*
Ndumiso Nkululeko Ngcobo
220094861
Address Service class
11/06/2023

 */
import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {
@Autowired
    private ICustomerRepository customerRepository;


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
