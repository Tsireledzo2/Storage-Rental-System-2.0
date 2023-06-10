package za.ac.cput.repository;

public interface IRepository <objectType,t>{
    objectType create(objectType objectType);
    objectType read(t t);
    objectType update(objectType objectType);
    boolean delete(t t);
}

