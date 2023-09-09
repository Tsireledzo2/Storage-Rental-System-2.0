package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Employee;

import java.util.List;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee,String> {
   // public List<Driver> getAll();
    @Query("SELECT u FROM Employee u WHERE u.email = :email AND u.password = :password")
    public Employee findByEmailAndPassword(@Param("email") String email, @Param("password") String password);
}
