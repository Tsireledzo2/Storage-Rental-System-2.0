package za.ac.cput.repository.impl;

/*
Author @Ndumiso Nkululeko Ngcobo
Date:09/10/2023
Student Number: 220094861
This is a Address Impl Test Class
*/

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Address;
import za.ac.cput.factory.AddressFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class AddressImplTest {
    private static AddressImpl addressRepository = AddressImpl.getAddressRepository();
    private static Address address = AddressFactory.createAddress("10","Sir Lowry","Foreshore", "1234");

    @Test
    void a_create() {
        Address createAddress= addressRepository.create(address);
        assertEquals(address.getStreetNumber(),createAddress.getStreetNumber());
        System.out.println("Created address : " + createAddress );
    }
    @Test
    void b_read() {
        Address readAddress = addressRepository.read(address.getStreetNumber());
        assertNotNull(readAddress);
        System.out.println("Address: " +readAddress);

    }

    @Test
    void c_update() {
        Address newAddress = new Address.Builder().copy(address)
                .setStreetNumber("2433")
                .setStreetName("King Allie")
                .setState("bakkie")
                .setZipCode("324")
                .build();
        assertNotNull(addressRepository.update(address));
        System.out.println("Updated Address: " + newAddress);
    }

    @Test
    void delete() {
        boolean success = addressRepository.delete(address.getStreetNumber());
        assertTrue(success);
        System.out.println("deleted");

    }
    @Test
    void e_getAll() {
        System.out.println("All addresses: "+ addressRepository.getAll());
    }

}
