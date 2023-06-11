package za.ac.cput.service.impl;

import za.ac.cput.domain.StorageUnit;

import za.ac.cput.repository.impl.StorageUnitRepositoryImpl;

import za.ac.cput.service.StorageUnitService;

import java.util.Set;

public class StorageUnitServiceImpl implements StorageUnitService {

    private static StorageUnitServiceImpl service= null;
    private static StorageUnitRepositoryImpl storageUnitRepository = null;

    private StorageUnitServiceImpl(){

        storageUnitRepository = StorageUnitRepositoryImpl.getStorageUnitRepository();
    }

    public static StorageUnitServiceImpl getStorageUnitService(){
        if(service ==null){
            service = new StorageUnitServiceImpl();
        }
        return service;
    }

    @Override
    public StorageUnit create(StorageUnit storageUnit) {
        StorageUnit created= storageUnitRepository.create(storageUnit);
        return created;
    }

    @Override
    public StorageUnit read(String unitID) {
        StorageUnit read = storageUnitRepository.read(unitID);
        return read;

    }

    @Override
    public boolean delete(String unitId) {
        boolean success = storageUnitRepository.delete(unitId);
        return success;
    }

    @Override
    public Set<StorageUnit> getAll() {
        return storageUnitRepository.getAll();
    }
}
