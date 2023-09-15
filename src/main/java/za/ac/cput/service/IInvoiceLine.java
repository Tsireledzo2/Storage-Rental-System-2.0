package za.ac.cput.service;

import za.ac.cput.domain.InvoiceLine;

import java.util.List;

public interface IInvoiceLine extends IService<InvoiceLine, String>{

    public List<InvoiceLine> getAll();
}
