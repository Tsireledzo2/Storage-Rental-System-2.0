package za.ac.cput.controller;
/*
 * CheckOutController.java
 * Booking Entity
 * @author: Argus Hakizimana Mbogo (220073260)
 * Date: 15 June 2023
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Checkout;
import za.ac.cput.service.impl.CheckoutServiceImpl;


import java.util.Set;

@RestController
@RequestMapping("/Checkout")
@CrossOrigin(origins = "http://localhost:8080")
public class CheckoutController {

    @Autowired
    private CheckoutServiceImpl CheckoutService;

    @PostMapping("/create")
    public Checkout create(@RequestBody Checkout checkout) {
        return CheckoutService.create(checkout);
    }

    @PostMapping("/read/{id}")
    public Checkout read(@PathVariable String id){return CheckoutService.read(id);}

    @PostMapping("/update")
    public Checkout update (@RequestBody Checkout checkout) {
        return CheckoutService.update(checkout);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id) {
        return CheckoutService.delete(id);
    }

    @GetMapping("/getAll")
    public Set<Checkout> getAll() {
        return CheckoutService.getAll();
    }
}
