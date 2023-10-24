package za.ac.cput.repository;
/*
This is a Customer Class
Author @Ndumiso Nkululeko Ngcobo
Date: 07-04-2023
Student Number: 220094861
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, String> {
    @Query("SELECT u FROM Customer u WHERE u.email = :email AND u.password = :password")
    public Customer findByEmailAndPassword(@Param("email") String email, @Param("password") String password);

    @Query("SELECT u FROM Customer u WHERE u.email = :email")
    public Customer getCustomersByEmail(@Param("email") String email);

//    Optional<User> findUserByEmail(String email);
}
