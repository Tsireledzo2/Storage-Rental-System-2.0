package za.ac.cput.controller;
/*
Ndumiso Nkululeko Ngcobo
24/08/2023
220094861
Address Controller Class
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Address;
import za.ac.cput.factory.AddressFactory;
import za.ac.cput.service.IAddressService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private IAddressService addressService;

    @PostMapping("/create")
    public Address create(@RequestBody Address address) {
        return addressService.create(address);
    }

    @GetMapping("/read/{id}")
    public Address read(@PathVariable String id) {
        return addressService.read(id);
    }

    @PostMapping("/update")
    public Address update(@RequestBody Address address) {
        return addressService.update(address);

    }

    @GetMapping("/getall")
    public List<Address> getAll() {
        return addressService.getAll();
    }

    @DeleteMapping("/delete")
    public boolean delete(@PathVariable String id) {
        return addressService.delete(id);
    }


    @GetMapping("/getAddressByBookingNumber/{bookingNumber}")
    public Address getAddressByBookingNumber(@PathVariable Long bookingNumber){
        return addressService.getAddressByBookingNumber(bookingNumber);
    }

    @GetMapping("/findByBookingNumber")
    public ResponseEntity<Address> findByBookingNumber(@RequestParam("bookingNumber") Long bookingNumber) {
        Address address = addressService.getAddressByBookingNumber(bookingNumber);
        if (address != null) {
            return new ResponseEntity<>(address, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}