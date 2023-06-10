package za.ac.cput.service.impl;

import za.ac.cput.domain.InvoiceLine;
import za.ac.cput.repository.IInvoiceLineRepository;
import za.ac.cput.repository.impl.InvoiceLineRepositoryImpl;
import za.ac.cput.service.IInvoiceLineService;
import za.ac.cput.service.IService;

import java.util.Set;

public class InvoiceLineServiceimpl implements IInvoiceLineService {
    private static InvoiceLineServiceimpl invoiceService= null;
    private IInvoiceLineRepository invoiceLineRepository = null;
    private InvoiceLineServiceimpl(){
        invoiceLineRepository = InvoiceLineRepositoryImpl.getRepository();
    }
    public static InvoiceLineServiceimpl getInstance(){
        if (invoiceService== null){
            invoiceService = new InvoiceLineServiceimpl();
        }
        return invoiceService;
    }

    @Override
    public InvoiceLine create(InvoiceLine invoiceLine) {
        return invoiceLineRepository.create(invoiceLine);
    }

    @Override
    public boolean delete(String id) {
        boolean success = invoiceLineRepository.delete(id);
        return success;
    }

    @Override
    public Set<InvoiceLine> getAll() {
        return invoiceLineRepository.getAll();
    }
}
