package za.ac.cput.repository;

public interface IRepository<objectType,string> {
    objectType create(objectType objectType);
    objectType read(string string);
    objectType update(objectType objectType);
    boolean delete(string string);
}
