package za.ac.cput.controller;
/*
Ndumiso Nkululeko Ngcobo
24/08/2023
220094861
Address Controller Class
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Address;
import za.ac.cput.factory.AddressFactory;
import za.ac.cput.service.IAddressService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/admin")
public class AddressController {
    @Autowired
    private IAddressService addressService;

    @PostMapping("/create")
    public Address create (@RequestBody Address address){
        Address newAddress = AddressFactory.createAddress(address.getZipCode(),
                                                          address.getStreetName(),
                                                        address.getState(), address.getStreetName());
        return addressService.create(newAddress);
    }

@GetMapping("/read/{id}")
    public Address read(@PathVariable String id){
        return addressService.read(id);
}

@PostMapping("/update")
    public Address update(@RequestBody Address address){
        return addressService.update(address);

}
@GetMapping("/getall")
public List<Address> getAll(){
        return addressService.getAll();
}

@DeleteMapping("/delete")
    public boolean delete(@PathVariable String id){
        return addressService.delete(id);
}
}
