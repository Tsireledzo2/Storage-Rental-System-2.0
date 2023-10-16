package za.ac.cput.factory;
/*
Ndumiso Nkululeko Ngcobo
220094861
This is an Address Class
 */
import za.ac.cput.domain.Address;
import za.ac.cput.domain.Booking;
import za.ac.cput.util.Helper;

public class AddressFactory {

    public static Address createAddress(String streetNumber,
                                        String streetName,
                                        String state,
                                        String zipCode,
                                        Booking booking){

        if ( Helper.isNullorEmpty(streetNumber)||
                Helper.isNullorEmpty(streetName)
                || Helper.isNullorEmpty(state)
                || Helper.isNullorEmpty(zipCode)){
            return null;
        }



        Address address =  new Address.Builder()
                .setStreetNumber(streetNumber)
                .setStreetName(streetName)
                .setState(state)
                .setZipCode(zipCode)
                .setBooking(booking)
                .build();

        return address;
    }
}
