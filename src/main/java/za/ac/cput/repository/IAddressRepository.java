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
import za.ac.cput.domain.Address;

@Repository
public interface IAddressRepository extends JpaRepository<Address, String> {

    @Query("SELECT a FROM Address a WHERE a.booking.bookingNumber = :bookingNumber")
    public Address getAddressByBookingNumber(@Param("bookingNumber") Long bookingNumber);
}
