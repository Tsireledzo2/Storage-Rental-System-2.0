package za.ac.cput.repository;


@Deprecated
public interface IRepository<objectType, t> {

    //crud
    objectType create(objectType objectType);

    objectType read(t t);

    objectType update(objectType objectType);

    boolean delete(t t);
}