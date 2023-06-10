package za.ac.cput.service;

public interface IService <objectType,primaryKey> {
    objectType create(objectType objectType);
    objectType read(primaryKey primaryKey);
    objectType update(objectType objectType);
    boolean delete(primaryKey primaryKey);
}
