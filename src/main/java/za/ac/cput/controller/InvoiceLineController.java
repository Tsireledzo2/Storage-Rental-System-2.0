package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.InvoiceLine;
import za.ac.cput.factory.InvoiceLineFactory;
import za.ac.cput.service.impl.InvoiceLineService;

import java.util.List;

@RestController
@RequestMapping("invoiceline")
public class InvoiceLineController {
    @Autowired
    private InvoiceLineService invoiceLineService;

    @PostMapping("create")
    public InvoiceLine create(@RequestBody InvoiceLine invoiceLine){
        InvoiceLine create = InvoiceLineFactory.buildInvoiceLine("10","new",10, 992.3,52.3);
        return  invoiceLineService.create(invoiceLine);
    }

    @GetMapping("read/{id}")
    public InvoiceLine read(@PathVariable String id){
        return invoiceLineService.read(id);
    }
    @PostMapping("/update")
    public InvoiceLine update(@RequestBody InvoiceLine invoiceLine){
        return  invoiceLineService.update(invoiceLine);
    }

    @DeleteMapping("/delete/{id}")
    public  boolean delete(@PathVariable String id){
        return invoiceLineService.delete(id);
    }
    @GetMapping({"/getAll"})
    public List<InvoiceLine> getAll(){
        return invoiceLineService.getAll();
    }
}
