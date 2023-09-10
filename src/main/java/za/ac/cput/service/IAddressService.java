package za.ac.cput.service;
/*
Ndumiso Nkululeko Ngcobo
Address Service interface
220094861
11/06/23

 */
import za.ac.cput.domain.Address;

import java.util.List;
import java.util.Set;
    public interface IAddressService extends IService<Address,String> {
        public List<Address> getAll();
    }

