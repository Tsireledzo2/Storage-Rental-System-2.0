package za.ac.cput.repository.impl;
/*
Author @Ndumiso Nkululeko Ngcobo
Student Number: 220094861
Date: 09/10/2023
This is acustomer impl test class
*/

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Customer;
import za.ac.cput.factory.CustomerFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class CustomerImplTest {
    private static CustomerImpl customerRepository = CustomerImpl.getCustomerRepository();
    private static Customer customer = CustomerFactory.createCustomer("Ndumiso","Ngcobo","Chris@gmail.com", "087643");

    @Test
    void a_create() {
        Customer createCustomer= customerRepository.create(customer);
        assertEquals(customer.getCustomerId(),createCustomer.getCustomerId());
        System.out.println("Created customer : " +createCustomer );
    }
    @Test
    void b_read() {
        Customer readCustomer = customerRepository.read(customer.getCustomerId());
       assertNotNull(readCustomer);
        System.out.println("Customer: " +readCustomer);

    }

    @Test
    void c_update() {
        Customer newCustomer = new Customer.Builder().copy(customer)
                .setFirstName("Ndumiso")
                .setLastName("Ngcobo")
                .setEmail("Chris@gmail.com")
                .setPhone("434")
                .build();
        assertNotNull(customerRepository.update(customer));
        System.out.println("Updated Customer: " + newCustomer);
    }
    @Test
    void d_delete() {
        boolean success = customerRepository.delete(customer.getCustomerId());
        assertTrue(success);
        System.out.println("deleted");

    }

    @Test
    void e_getAll() {
        System.out.println("All Customers: "+customerRepository.getAll());
    }
}

