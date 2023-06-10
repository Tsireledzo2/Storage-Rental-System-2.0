package za.ac.cput.repository;

import za.ac.cput.domain.InvoiceLine;

import java.util.Set;

public interface IInvoiceLineRepository extends IRepository<InvoiceLine, String> {
    Set<InvoiceLine> getAll();
}
