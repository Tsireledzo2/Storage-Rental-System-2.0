package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Customer;

import static org.junit.jupiter.api.Assertions.*;
class CustomerFactoryTest {

    @Test
    void EqualityTest(){
        Customer customer = CustomerFactory.createCustomer("Ndumiso","Ngcobo","Nduh@gmail.com", "067 9580801");
        System.out.println("Customer: " + customer.toString());
        assertNotNull(customer);
    }


  
}