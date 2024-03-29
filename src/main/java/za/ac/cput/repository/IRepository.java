/**
 * IRepository.java
 * basecode
 * Interface for the IRepository
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 06 June 2023
 */
package za.ac.cput.repository;
@Deprecated
public interface IRepository<objectType, t> {
    //crud
    objectType create(objectType objectType);

    objectType read(t t);

    objectType update(objectType objectType);

    boolean delete(t t);
}