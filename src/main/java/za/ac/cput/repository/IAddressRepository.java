package za.ac.cput.repository;
/*
This is a Customer Class
Author @Ndumiso Nkululeko Ngcobo
Date: 07-04-2023
Student Number: 220094861
 */
import za.ac.cput.domain.Address;

import java.util.Set;

public interface IAddressRepository extends IRepository <Address, String> {

    public Set <Address> getAll();
}
