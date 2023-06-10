package za.ac.cput.repository.impl;

import za.ac.cput.repository.IManagerRepository;
import za.ac.cput.domain.Manager;

import java.util.HashSet;
import java.util.Set;

public class ManagerImpl implements IManagerRepository {
    private static ManagerImpl managerRepository = null;
    private Set<Manager> managerDB = null;
    private ManagerImpl(){
        managerDB = new HashSet<Manager>();
    }
    public static ManagerImpl getManagerRepository(){
        if(managerRepository == null){
            managerRepository = new ManagerImpl();
        }
        return managerRepository;
    }

    @Override
    public Manager create(Manager manager) {
        boolean success = managerDB.add(manager);
        System.out.println("Manager:" +managerDB);
        if(!success)
        return null;
        return manager;
    }

    @Override
    public Manager read(String managerID) {
        Manager manager = managerDB.stream().filter(manager1 -> manager1.getManagerID().equals(managerID) )
                .findAny()
                .orElse(null);

        return manager;
    }

    @Override
    public Manager update(Manager manager) {
        Manager oldManager = read(manager.getManagerID());
        if(oldManager != null){
            managerDB.remove(oldManager);
            managerDB.add(manager);
            return manager;
        }
        return null;
    }

    @Override
    public boolean delete(String managerID) {
        Manager managerToDelete = read(managerID);
        if(managerToDelete==null)
        return false;
        managerDB.remove(managerToDelete);
        return true;
    }

    @Override
    public Set<Manager> getAll() {
        return managerDB;
    }

}