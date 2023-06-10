package za.ac.cput.service;

import za.ac.cput.domain.Checkin;

import java.util.Set;

public interface CheckinService extends IService<Checkin,String>{
    Set<Checkin> getAll();
}
