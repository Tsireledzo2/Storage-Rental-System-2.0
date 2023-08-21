package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.Vehicle;
import za.ac.cput.service.impl.VehicleServiceImpl;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class VehicleController {

    @Autowired
    VehicleServiceImpl vehicleService;
    @PostMapping("/createVehicle")
    public Vehicle create(@RequestBody Vehicle employee){
        return vehicleService.create(employee);
    }

    @GetMapping("/getVehicle/{numberPlate}")
    public Vehicle read(@PathVariable String numberPlate){
        return vehicleService.read(numberPlate);
    }

    @PostMapping("/updateVehicle")
    public Vehicle update(@RequestBody Vehicle vehicle){
        return vehicleService.update(vehicle);
    }

    @DeleteMapping("/deleteVehicle/{numberPlate}")
    public boolean delete(@PathVariable String numberPlate){
        return vehicleService.delete(numberPlate);
    }

    @GetMapping("/getAllVehicles")
    public List<Vehicle> getAll(){
        return  vehicleService.getAll();
    }
}
