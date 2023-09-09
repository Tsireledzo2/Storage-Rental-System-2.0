package za.ac.cput.service.impl;
/*
Address Service Impl
Ndumiso Nkululeko Ngcobo
220094861
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Address;
import za.ac.cput.repository.IAddressRepository;
import za.ac.cput.service.IAddressService;

import java.util.List;
import java.util.Set;
@Service
public class AddressServiceImpl implements IAddressService {

    private IAddressRepository addressRepository;

    @Autowired
    private AddressServiceImpl (IAddressRepository addressRepository) {

        this.addressRepository = addressRepository;
    }

    @Override
    public List<Address> getAll() {

        return addressRepository.findAll();
    }

    @Override
    public Address create(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Address read(String s) {
        return addressRepository.findById(s).orElse(null);
    }

    @Override
    public Address update(Address address) {
        if(this.addressRepository.existsById(address.getZipCode()))
            return this.addressRepository.save(address);
        return null;
    }

    @Override
    public boolean delete(String s) {
        if(this.addressRepository.existsById(s)) {
            this.addressRepository.deleteById(s);
            return true;
        }
        return false;
    }
}
