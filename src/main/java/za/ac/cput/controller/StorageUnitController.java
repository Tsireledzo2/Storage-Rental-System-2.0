package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.StorageUnit;
import za.ac.cput.service.impl.StorageUnitServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/storageUnit")
public class StorageUnitController {

    @Autowired // set  up object
    private StorageUnitServiceImpl storageUnitService;

    @PostMapping("/create")
    public StorageUnit create(@RequestBody StorageUnit storageUnit) {

        return storageUnitService.create(storageUnit);

    }

    @GetMapping("/read/{id}")
    public StorageUnit read(@PathVariable String id) {
        return storageUnitService.read(id);
    }

    @PostMapping("/ update")
    public StorageUnit update(@RequestBody StorageUnit storageUnit) {
        return storageUnitService.update(storageUnit);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id) {
        return storageUnitService.delete(id);
    }

    @GetMapping("/getAll")
    public List<StorageUnit> getAll() {
        return storageUnitService.getAll();


    }

}
