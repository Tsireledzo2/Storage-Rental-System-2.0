package za.ac.cput.factory;
/*
Ndumiso Nkululeko Ngcobo
220094861
This is an Address Class
 */
import za.ac.cput.domain.Customer;
import za.ac.cput.util.Helper;

public class CustomerFactory {

    public static Customer createCustomer(String firstName,
                                          String lastName,
                                          String email,
                                          String phone){


        if (Helper.isNullorEmpty(firstName) ||
                Helper.isNullorEmpty(lastName) ||
                Helper.isNullorEmpty(phone)){
            return null;
        }
        String customerID = Helper.generateId();
        if (!Helper.isValidEmail(email)){
            return null;
        }
        Customer customer = new Customer.Builder()
                .setCustomerId(customerID)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setPhone(phone)
                .build();
        return customer;
    }
}
