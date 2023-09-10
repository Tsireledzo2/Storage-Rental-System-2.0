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

    private ICustomerRepository customerRepository;

    @Autowired
    private CustomerServiceImpl(ICustomerRepository customerRepository){

        this.customerRepository = customerRepository;
    }
    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();

    }

    @Override
    public Customer create(Customer customer) {
        return customerRepository.save(customer);

    }

    @Override
    public Customer read(String customerId) {
     return customerRepository.findById(customerId).orElse(null);
    }

    @Override
    public Customer update(Customer customer) {
        if(this.customerRepository.existsById(customer.getCustomerId()))
            return this.customerRepository.save(customer);
        return null;
    }

    @Override
    public boolean delete(String customerId) {
        if(this.customerRepository.existsById(customerId)) {
            this.customerRepository.deleteById(customerId);
            return true;
        }
        return false;
    }
}
