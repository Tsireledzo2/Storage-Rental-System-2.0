package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Invoice;
import za.ac.cput.repository.IInvoiceRepository;
import za.ac.cput.service.IInvoice;

import java.util.List;
@Service
public class InvoiceService implements IInvoice {

    private IInvoiceRepository invoice ;
    @Autowired
    public InvoiceService(IInvoiceRepository invoice){
        this.invoice=invoice;
    }
    @Override
    public Invoice create(Invoice t) {
        return invoice.save(t);
    }

    @Override
    public Invoice read(String s) {
        return this.invoice.findById(s).orElse(null);
    }

    @Override
    public Invoice update(Invoice invoice) {
        if (this.invoice.existsById(invoice.getInvoiceNumber()))
            return this.invoice.save(invoice);
        return null;
    }

    @Override
    public boolean delete(String s) {
        if (this.invoice.existsById(s)){
            this.invoice.deleteById(s);
        }
        return false ;
    }

    @Override
    public List<Invoice> getAll() {
        return this.invoice.findAll();
    }
}
