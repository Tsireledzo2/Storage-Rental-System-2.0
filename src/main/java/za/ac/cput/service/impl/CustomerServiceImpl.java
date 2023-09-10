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
    public Customer create(Customer customer) {
        return customerRepository.save(customer);

    }

    @Override
    public Customer read(String email) {
     return customerRepository.findById(email).orElse(null);
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public List<Customer> getAll() {
        return null;
    }
}
