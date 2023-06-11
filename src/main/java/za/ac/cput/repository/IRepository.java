/**
 * This worked as a basecode
 * IRepository.java
 * Interface for the IRepository
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 08 April 2023
 */






package za.ac.cput.repository;
public interface IRepository <objectType,t>{

    objectType create(objectType objectType);
    objectType read(t t);
    objectType update(objectType objectType);
    boolean delete(t t);

}

