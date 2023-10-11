package za.ac.cput.service;
/*
Ndumiso Nkululeko Ngcobo
220094861
Customer Service interface
11/06/23
 */
import org.springframework.data.repository.query.Param;
import za.ac.cput.domain.Customer;

import java.util.List;
import java.util.Set;
    public interface ICustomerService extends IService<Customer,String> {
        public List<Customer> getAll();

        public Customer login(String email, String password);

       // public Customer Resetpassword( String password,  String email);
       public Customer getCustomersByEmail(String email);

        public Customer updateP(Customer customer);

    }


