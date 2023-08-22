package za.ac.cput.controller;
/*
 * CheckinController.java
 * Booking Entity
 * @author: Argus Hakizimana Mbogo (220073260)
 * Date: 15 June 2023
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Checkin;
import za.ac.cput.service.impl.CheckinServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/Checkin")
public class CheckinController {

    @Autowired
    private CheckinServiceImpl CheckinService;

    @PostMapping("/create")
    public Checkin create(@RequestBody Checkin checkin) {
        return CheckinService.create(checkin);
    }

    @PostMapping
    public Checkin read(@PathVariable String id){return CheckinService.read(id);}

    @PostMapping
    public Checkin update (@RequestBody Checkin checkin) {
        return CheckinService.update(checkin);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id) {
        return CheckinService.delete(id);
    }

    @GetMapping("/getAll")
    public Set<Checkin> getAll() {
        return CheckinService.getAll();
    }
}
