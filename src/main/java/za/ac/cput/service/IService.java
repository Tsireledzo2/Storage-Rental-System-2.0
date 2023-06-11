package za.ac.cput.service;
 
/*
Ndumiso Nkululeko Ngcobo
220094861
Service Interface
11/06/23
 */
public interface IService <objectType,primaryKey> {

        objectType create(objectType objectType);
        objectType read(primaryKey primaryKey);
        objectType update(objectType objectType);
        boolean delete(primaryKey primaryKey);
}
