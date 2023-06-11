package za.ac.cput.service;
/*
 * CheckinService.java
 * CheckinService Entity
 * @author: Argus Hakizimana Mbogo (220073260)
 * Date: 09 June 2023
 */

import za.ac.cput.domain.Checkin;

import java.util.Set;

public interface CheckinService extends IService<Checkin,String>{
    Set<Checkin> getAll();
}
