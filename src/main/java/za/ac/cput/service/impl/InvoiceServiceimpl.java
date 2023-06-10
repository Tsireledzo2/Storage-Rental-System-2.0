package za.ac.cput.service.impl;

import za.ac.cput.domain.Invoice;
import za.ac.cput.repository.IInvoiceLineRepository;
import za.ac.cput.repository.IInvoiceRepository;
import za.ac.cput.repository.impl.InvoiceLineRepositoryImpl;
import za.ac.cput.repository.impl.InvoiceRepositoryImpl;
import za.ac.cput.service.IInvoiceService;

import java.util.Set;

public class InvoiceServiceimpl implements IInvoiceService {
    private static InvoiceServiceimpl invoiceService= null;
    private IInvoiceRepository invoiceRepository= null;
    private InvoiceServiceimpl(){
        invoiceRepository = InvoiceRepositoryImpl.getInvoiceRepository();
    }

    public static InvoiceServiceimpl getInstance(){
        if (invoiceService== null){
            invoiceService = new InvoiceServiceimpl();
        }
        return invoiceService;
    }
    @Override
    public Invoice create(Invoice invoice) {
        return invoiceRepository.create(invoice) ;
    }

    @Override
    public boolean delete(String id) {
        boolean success = invoiceRepository.delete(id);
        return success;
    }

    @Override
    public Set<Invoice> getAll() {
        return invoiceRepository.getAll();
    }
}
