/**
 * IService.java
 * Basecode
 * Interface for the IService
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 06 June 2023
 */
package za.ac.cput.service;


public interface IService <objectType,primaryKey>{



public interface IService <objectType,primaryKey> {
    objectType create(objectType objectType);
    objectType read(primaryKey primaryKey);
    objectType update(objectType objectType);
    boolean delete(primaryKey primaryKey);
}

