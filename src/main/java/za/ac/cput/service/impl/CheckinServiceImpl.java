package za.ac.cput.service.impl;
/*
 * CheckinServiceImpl.java
 * CheckinServiceImpl Entity
 * @author: Argus Hakizimana Mbogo (220073260)
 * Date: 09 June 2023
 */

import za.ac.cput.domain.Checkin;
import za.ac.cput.repository.ICheckinRepository;
import za.ac.cput.repository.impl.CheckinImpl;
import za.ac.cput.service.CheckinService;

import java.util.Set;

public class CheckinServiceImpl implements CheckinService {

    private static CheckinServiceImpl service;

    private ICheckinRepository repository;

    private CheckinServiceImpl() {
         repository = CheckinImpl.getRepository();
    }

    public static CheckinServiceImpl getService() {
        return (service == null)? service = new CheckinServiceImpl(): service;
    }

    @Override
    public Checkin create(Checkin checkin) {
        return repository.create(checkin);
    }

    @Override
    public Checkin read(String s) {
        return repository.read(s);
    }

    @Override
    public Checkin update(Checkin checkin) {
        return repository.create(checkin);
    }

    @Override
    public boolean delete(String s) {
        return repository.delete(s);
    }

    @Override
    public Set<Checkin> getAll() {
        return repository.getAll();
    }

}
