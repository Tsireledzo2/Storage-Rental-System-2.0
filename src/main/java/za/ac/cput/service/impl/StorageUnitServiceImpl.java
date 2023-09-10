package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.StorageUnit;

import za.ac.cput.repository.StorageUnitRepository;
import za.ac.cput.service.StorageUnitService;

import java.util.List;
import java.util.Set;
@Service
public class StorageUnitServiceImpl implements StorageUnitService {


    private static StorageUnitRepository repository = null;
 @Autowired
    private StorageUnitServiceImpl(StorageUnitRepository repository){
        this.repository = repository;
    }



    @Override
    public StorageUnit create(StorageUnit storageUnit) {
        return this.repository.save(storageUnit);
    }

    @Override
    public StorageUnit read(String unitID) {
        return  this.repository.findById(unitID).orElse(null);

    }

    public StorageUnit update(StorageUnit storageUnit) {
        if (this.repository.existsById(storageUnit.getUnitId()))
            return this.repository.save(storageUnit);
        return null;


    }
    @Override
    public boolean delete(String unitId) {
            if (this.repository.existsById(unitId)) {
                this.repository.deleteById(unitId);
                return true;
            }
            return false;

    }

    @Override
    public List <StorageUnit> getAll() {
    return this.repository.findAll();
    }
}
