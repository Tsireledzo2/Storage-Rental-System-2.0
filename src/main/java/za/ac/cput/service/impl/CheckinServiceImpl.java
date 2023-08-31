package za.ac.cput.service.impl;
/*
 * CheckinServiceImpl.java
 * CheckinServiceImpl Entity
 * @author: Argus Hakizimana Mbogo (220073260)
 * Date: 09 June 2023
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Checkin;
import za.ac.cput.repository.ICheckinRepository;;
import za.ac.cput.service.CheckinService;

import java.util.Set;
@Service
public class CheckinServiceImpl implements CheckinService {

    private final ICheckinRepository repository;

    @Autowired
    private CheckinServiceImpl(ICheckinRepository repository) {

        this.repository = repository;
    }


    @Override
    public Set<Checkin> getAll() {
        return repository.getAll();
    }

    @Override
    public Checkin create(Checkin checkin) {
    return this.repository.save(checkin);
    }

    @Override
    public Checkin read(String id) {
        return this.repository.findById(id).orElse(null);
    }

    @Override
    public Checkin update(Checkin checkin) {
        return this.repository.save(checkin);
    }

    @Override
    public boolean delete(String id) {
        if (this.repository.existsById(id)) {
            this.repository.deleteById(id);
            return true;
        }
        return false;
    }
}
