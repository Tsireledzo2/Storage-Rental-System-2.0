package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Driver;
import za.ac.cput.service.impl.DriverServiceImpl;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class DriverController {

    @Autowired
    DriverServiceImpl driverService;
    @PostMapping("/createVehicle")
    public Driver create(@RequestBody Driver driver){
        return driverService.create(driver);
    }

    @GetMapping("/getVehicle/{licenceNumber}")
    public Driver read(@PathVariable String licenceNumber){
        return driverService.read(licenceNumber);
    }

    @PostMapping("/updateVehicle")
    public Driver update(@RequestBody Driver driver){
        return driverService.update(driver);
    }

    @DeleteMapping("/deleteVehicle/{numberPlate}")
    public boolean delete(@PathVariable String numberPlate){
        return driverService.delete(numberPlate);
    }

    @GetMapping("/getAllVehicles")
    public List<Driver> getAll(){
        return driverService.getAll();
    }
}