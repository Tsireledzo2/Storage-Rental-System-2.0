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

    public static Customer createCustomer(String fullName,

                                          String email,
                                          String cellphone,
                                          String password,
    boolean agreeToTerms){


        if (Helper.isNullorEmpty(fullName) ||

                Helper.isNullorEmpty(cellphone) || Helper.isNullorEmpty(password)){
            return null;
        }

        if (!Helper.isValidEmail(email)){
            return null;
        }
        Customer customer = new Customer.Builder()

                .setFullName(fullName)

                .setEmail(email)
                .setCellphone(cellphone)
                .setAgreeToTerms(agreeToTerms)

                .build();
        return customer;
    }
}
