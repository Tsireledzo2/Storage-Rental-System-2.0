package za.ac.cput.repository.impl;

import za.ac.cput.domain.InvoiceLine;
import za.ac.cput.repository.IInvoiceLineRepository;

import java.util.HashSet;
import java.util.Set;

public class InvoiceLineRepositoryImpl implements IInvoiceLineRepository {
    private static InvoiceLineRepositoryImpl invoiceLineRepository = null;
    private Set<InvoiceLine> invoiceLineDB = null;

    private InvoiceLineRepositoryImpl(){
        invoiceLineDB = new HashSet<>();

    }
    private static InvoiceLineRepositoryImpl getInvoiceLineRepository(){
        if (invoiceLineRepository == null){
            invoiceLineRepository = new InvoiceLineRepositoryImpl();
        }
        return invoiceLineRepository;
    }
    @Override
    public InvoiceLine create(InvoiceLine invoiceLine) {
        boolean success = this.invoiceLineDB.add(invoiceLine);
        System.out.println("invoceline"+ invoiceLineDB);
        if (!success)
            return null;
        return invoiceLine;
    }

    @Override
    public InvoiceLine read(String id) {
        for (InvoiceLine i : invoiceLineDB){
            if (i.getInvoiceListNumber().equals(id))
                return i;
        }
        return null;
    }

    @Override
    public InvoiceLine update(InvoiceLine invoiceLine) {
        InvoiceLine oldInvoiceLine = read(invoiceLine.getInvoiceListNumber());
        if (oldInvoiceLine != null){
            invoiceLineDB.remove(oldInvoiceLine);
            invoiceLineDB.add(invoiceLine);
            return invoiceLine;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        InvoiceLine invoiceLineDelete = read(s);
        if (invoiceLineDelete == null)
            return false;
        invoiceLineDB.remove(invoiceLineDelete);

        return true;
    }

    @Override
    public Set<InvoiceLine> getAll() {
        return invoiceLineDB;
    }
}
