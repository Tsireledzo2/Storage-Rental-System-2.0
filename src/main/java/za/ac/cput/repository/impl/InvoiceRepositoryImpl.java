package za.ac.cput.repository.impl;

import za.ac.cput.domain.Invoice;
import za.ac.cput.repository.IInvoiceRepository;

import java.util.HashSet;
import java.util.Set;

public class InvoiceRepositoryImpl implements IInvoiceRepository {

    private static InvoiceRepositoryImpl invoiceRepository = null;
    private Set<Invoice> invoiceDB = null;
    private InvoiceRepositoryImpl(){
        invoiceDB = new HashSet<>();
    }
    public static InvoiceRepositoryImpl getInvoiceRepository(){
        if (invoiceRepository == null){
            invoiceRepository = new InvoiceRepositoryImpl();
        }
        return invoiceRepository;
    }
    @Override
    public Invoice create(Invoice invoice) {
        boolean succes = this.invoiceDB.add(invoice);
        System.out.println("Invoice: "+ invoiceDB);
        if (!succes)
            return null;
        return invoice;
    }

    @Override
    public Invoice read(String id) {
        for (Invoice i : invoiceDB){
            if (i.getInvoiceNumber().equals(id))
                return i;
        }
        return null;
    }

    @Override
    public Invoice update(Invoice invoice) {
        Invoice oldInvoice = read(invoice.getInvoiceNumber());
        if (oldInvoice  != null){
            invoiceDB.remove(oldInvoice);
            invoiceDB.add(invoice);
            return invoice;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        Invoice invoiceDelete = read(s);
        if (invoiceDelete == null)
            return false;
        invoiceDB.remove(invoiceDelete);
        return true;
    }

    @Override
    public Set<Invoice> getAll() {
        return invoiceDB;
    }
}
