package za.ac.cput.service.impl;

import za.ac.cput.domain.StorageUnitType;

import za.ac.cput.repository.impl.StorageUnitTypeRepositoryImpl;
import za.ac.cput.service.StorageUnitTypeService;

import java.util.Set;

public class StorageUnitTypeServiceImpl implements StorageUnitTypeService {

    private static StorageUnitTypeServiceImpl service = null;
    private static StorageUnitTypeRepositoryImpl storageUnitTypeRepository = null;

    private StorageUnitTypeServiceImpl() {
       storageUnitTypeRepository = StorageUnitTypeRepositoryImpl.getStorageUnitTypeRepository();

    }

    public static StorageUnitTypeServiceImpl getService() {
        if(service == null){
            service = new StorageUnitTypeServiceImpl();
        }
        return service;
    }


    @Override
    public StorageUnitType create(StorageUnitType storageUnitType) {
        StorageUnitType created= storageUnitTypeRepository.create(storageUnitType);
        return created;
    }

    @Override
    public StorageUnitType read(Double length) {
        StorageUnitType read = storageUnitTypeRepository.read(length);
        return read;
    }

    @Override
    public StorageUnitType update(StorageUnitType storageUnitType) {
        return null;
    }

    @Override
    public boolean delete(Double length) {
        boolean success = storageUnitTypeRepository.delete(length);
        return success;
    }

    @Override
    public Set<StorageUnitType> getAll() {
        return storageUnitTypeRepository.getAll();
    }
}



