package za.ac.cput.service;

import za.ac.cput.domain.Invoice;

import java.util.Set;

public interface IInvoiceService {
    Invoice create(Invoice invoice);

    boolean delete(String id);

    Set<Invoice> getAll();

}
