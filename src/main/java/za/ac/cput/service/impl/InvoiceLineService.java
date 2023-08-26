package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.InvoiceLine;
import za.ac.cput.repository.IInvoiceLineRepository;
import za.ac.cput.service.IInvoiceLine;

import java.util.List;

@Service
public class InvoiceLineService implements IInvoiceLine {
    private IInvoiceLineRepository InvoiceLine;

    @Autowired
    public InvoiceLineService(IInvoiceLineRepository InvoiceLine){
        this.InvoiceLine = InvoiceLine;
    }

    @Override
    public InvoiceLine create(InvoiceLine T) {

        return InvoiceLine.save(T) ;
    }

    @Override
    public InvoiceLine read(String s) {
        return this.InvoiceLine.findById(s).orElse(null);
    }

    @Override
    public InvoiceLine update(InvoiceLine T) {
        if (this.InvoiceLine.existsById(T.getInvoiceLineId()))
            return this.InvoiceLine.save(T);
        return null;
    }

    @Override
    public boolean delete(String s) {
        if (this.InvoiceLine.existsById(s)){
            this.InvoiceLine.deleteById(s);
            return true;
        }
        return false;
    }
    @Override
    public List<InvoiceLine> getAll() {
        return this.InvoiceLine.findAll();
    }
}
