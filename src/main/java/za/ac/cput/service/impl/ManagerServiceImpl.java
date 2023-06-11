package za.ac.cput.service.impl;

import za.ac.cput.domain.Manager;
import za.ac.cput.service.IManagerService;
import za.ac.cput.repository.impl.ManagerImpl;
import java.util.Set;

public class ManagerServiceImpl implements IManagerService{
    private static ManagerServiceImpl managerService = null;
    private static ManagerImpl managerRepository = null;
    private ManagerServiceImpl(){
        managerRepository = ManagerImpl.getManagerRepository();
    }
    @Override
    public Set<Manager> getAll() {
        return managerRepository.getAll();
    }

    @Override
    public Manager create(Manager manager) {
        Manager created = managerRepository.create(manager);
        return created;
    }

    @Override
    public Manager read(String managerID) {
        Manager readManager = managerRepository.read(managerID);
        return readManager;
    }

    @Override
    public Manager update(Manager manager) {
        Manager updateManager = managerRepository.update(manager);
        return updateManager;
    }

    @Override
    public boolean delete(String managerID) {
        boolean success = managerRepository.delete(managerID);
        return success;
    }
}
