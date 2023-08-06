package za.ac.cput.repository;

import za.ac.cput.domain.Invoice;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Invoice;

@Repository
public interface IInvoiceRepository extends JpaRepository<Invoice,String> {
}
