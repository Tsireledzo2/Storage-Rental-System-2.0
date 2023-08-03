package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Invoice;
import za.ac.cput.service.IInvoice;

import java.util.List;

@Service
public class InvoiceService implements IInvoice {
    private InvoiceService invoiceService;

    @Autowired
    public InvoiceService(InvoiceService invoiceService){
        this.invoiceService = invoiceService;
    }

    @Override
    public IInvoice create(IInvoice T) {
        return null;
    }

    @Override
    public IInvoice read(String s) {
        return null;
    }

    @Override
    public IInvoice update(IInvoice T) {
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }
    @Override
    public List<Invoice> getAll() {
        return null;
    }
}
