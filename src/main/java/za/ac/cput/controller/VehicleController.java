package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.service.impl.VehicleServiceImpl;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class VehicleController {

    @Autowired
    VehicleServiceImpl vehicleService;
}
