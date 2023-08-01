/**
 * IRepository.java
 * basecode
 * Interface for the IRepository
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 06 June 2023
 */
package za.ac.cput.repository;

public interface IRepository<objectType,string> {
    objectType create(objectType objectType);
    objectType read(string string);
    objectType update(objectType objectType);
    boolean delete(string string);
}
