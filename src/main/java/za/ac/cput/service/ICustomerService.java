package za.ac.cput.service;
/*
Ndumiso Nkululeko Ngcobo
220094861
Customer Service interface
11/06/23
 */
import za.ac.cput.domain.Customer;

import java.util.List;
import java.util.Set;
    public interface ICustomerService extends IService<Customer,String> {
        public List<Customer> getAll();
    }

