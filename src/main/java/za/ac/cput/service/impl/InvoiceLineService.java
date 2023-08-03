package za.ac.cput.service.impl;

import za.ac.cput.domain.InvoiceLine;
import za.ac.cput.repository.IInvoiceLineRepository;
import za.ac.cput.repository.impl.InvoiceLineRepositoryImpl;
import za.ac.cput.service.IInvoiceLine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.InvoiceLine;
import za.ac.cput.service.IInvoiceLine;

import java.util.List;

@Service
public class InvoiceLineService implements IInvoiceLine {
    private InvoiceLineService invoiceLineService;

    @Autowired
    public InvoiceLineService(InvoiceLineService invoiceLineService){
        this.invoiceLineService = invoiceLineService;
    }

    @Override
    public InvoiceLine create(InvoiceLine T) {
        return null;
    }

    @Override
    public InvoiceLine read(String s) {
        return null;
    }

    @Override
    public InvoiceLine update(InvoiceLine T) {
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }
    @Override
    public List<InvoiceLine> getAll() {
        return null;
    }
}
