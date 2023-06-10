package za.ac.cput.service;

import za.ac.cput.domain.InvoiceLine;

import java.util.Set;

public interface IInvoiceLineService {
    InvoiceLine create(InvoiceLine invoiceLine);
    boolean delete(String id);
    Set<InvoiceLine> getAll();
}
