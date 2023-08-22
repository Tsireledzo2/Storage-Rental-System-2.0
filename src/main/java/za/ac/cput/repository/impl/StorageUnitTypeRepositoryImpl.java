

/**
 *  StorageUnitTypeRepository.java
 * Author Ruvimbo Ndoro 220128871
 * Date 10June 2023
 */


package za.ac.cput.repository.impl;

import za.ac.cput.domain.StorageUnitType;
import za.ac.cput.repository.StorageUnitTypeRepository;

import java.util.HashSet;
import java.util.Set;


    public class StorageUnitTypeRepositoryImpl implements StorageUnitTypeRepository {

        private static StorageUnitTypeRepositoryImpl repository= null;

        private Set<StorageUnitType> storageUnitTypeDB = null;

        private StorageUnitTypeRepositoryImpl(){
            storageUnitTypeDB = new HashSet<StorageUnitType>();
        }

        public static StorageUnitTypeRepositoryImpl getStorageUnitTypeRepository(){
            if (repository == null){
                repository = new StorageUnitTypeRepositoryImpl();
            }
            return repository;
        }
        @Override
        public StorageUnitType create(StorageUnitType storageUnitType) {
            boolean success = storageUnitTypeDB.add(storageUnitType);
            System.out.println("StorageUnits : "+storageUnitTypeDB);
            if (!success)
                return null;
            return storageUnitType;
        }

        @Override
        public StorageUnitType read(Double length) {
            StorageUnitType storageUnitType = storageUnitTypeDB.stream().filter(storageUnitType1 -> storageUnitType1.getLength() ==(length))
                    .findAny()
                    .orElse(null);
            return  storageUnitType;
        }

        @Override
        public StorageUnitType update(StorageUnitType storageUnitType) {
            StorageUnitType oldStorageUnitType = read(storageUnitType.getLength());
            if(oldStorageUnitType!= null){
                storageUnitTypeDB.remove(oldStorageUnitType);
                storageUnitTypeDB.add(storageUnitType);
                return storageUnitType;
            }
            return null;
        }

        @Override
        public boolean delete(Double length) {
            StorageUnitType storageUnitTypeToDelete = read(length);
            if(storageUnitTypeToDelete == null)
                return false;
            storageUnitTypeDB.remove(storageUnitTypeToDelete);
            return true;
        }

        @Override
        public Set<StorageUnitType> getAll() {

            return storageUnitTypeDB;
        }
    }





