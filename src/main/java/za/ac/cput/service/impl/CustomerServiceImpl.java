package za.ac.cput.service.impl;
import za.ac.cput.domain.Customer;
import za.ac.cput.repository.impl.CustomerImpl;
import za.ac.cput.service.ICustomerService;
/*
Ndumiso Nkululeko Ngcobo
220094861
Address Service class
11/06/2023

 */
import java.util.Set;

public class CustomerServiceImpl implements ICustomerService {
    private static CustomerServiceImpl customerService= null;
    private static CustomerImpl customerRepository = null;

    private CustomerServiceImpl(){

        customerRepository = CustomerImpl.getCustomerRepository();
    }
    @Override
    public Set<Customer> getAll() {
        return customerRepository.getAll();

    }

    @Override
    public Customer create(Customer customer) {
        Customer createAddress = customerRepository.create(customer);
        return createAddress;

    }

    @Override
    public Customer read(String s) {
     Customer readCustomer = customerRepository.read(s);
     return readCustomer;
    }

    @Override
    public Customer update(Customer customer) {
        Customer updateCustomer = customerRepository.update(customer);
        return updateCustomer;
    }

    @Override
    public boolean delete(String s) {
        boolean success = customerService.delete(s);
        return success;
    }
}
