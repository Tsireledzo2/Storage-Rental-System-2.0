package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.InvoiceLine;

@Repository
public interface IInvoiceLineRepository extends JpaRepository<InvoiceLine,String> {
}
