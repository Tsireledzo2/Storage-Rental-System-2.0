package za.ac.cput.service.impl;
/*
Address Service Impl
Ndumiso Nkululeko Ngcobo
220094861
 */
import za.ac.cput.domain.Address;
import za.ac.cput.repository.impl.AddressImpl;
import za.ac.cput.service.IAddressService;

import java.util.Set;

public class AddressServiceImpl implements IAddressService {

    private static AddressServiceImpl addressService  = null;
    private static AddressImpl addressRepository = null;

    private AddressServiceImpl (){

        addressRepository = AddressImpl.getAddressRepository();
    }

    public static AddressServiceImpl getAddressService(){
        if(addressService ==null){
           addressService = new AddressServiceImpl();
        }
        return addressService;
    }

    @Override
    public Set<Address> getAll() {
        return addressRepository.getAll();
    }

    @Override
    public Address create(Address address) {
        Address createAddress = addressRepository.create(address);
        return createAddress;

    }

    @Override
    public Address read(String s) {
        Address readAddress = addressRepository.read(s);
        return readAddress;

    }

    @Override
    public Address update(Address address) {
        Address updateAddress = addressRepository.update(address);
        return updateAddress;
    }

    @Override
    public boolean delete(String s) {
        boolean success = addressService.delete(s);
        return success;
    }
}
