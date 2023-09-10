package za.ac.cput.factory;
/*
Ndumiso Nkululeko Ngcobo
220094861
This is an Address Class
 */
import za.ac.cput.domain.Address;
import za.ac.cput.domain.Customer;
import za.ac.cput.util.Helper;

public class CustomerFactory {

    public static Customer createCustomer(String firstName,
                                          String surname,
                                          String email,
                                          String cellphone
                                          /*Address address*/){


        if (Helper.isNullorEmpty(firstName) ||
                Helper.isNullorEmpty(surname) ||
                Helper.isNullorEmpty(cellphone)){
            return null;
        }
        String customerID = Helper.generateId();
        if (!Helper.isValidEmail(email)){
            return null;
        }
        Customer customer = new Customer.Builder()

                .setFirstName(firstName)
                .setSurname(surname)
                .setEmail(email)
                .setCellphone(cellphone)
                //.setAddress(address)
                .build();
        return customer;
    }
}
