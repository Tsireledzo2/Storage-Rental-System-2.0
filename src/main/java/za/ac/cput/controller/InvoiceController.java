package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Invoice;
import za.ac.cput.factory.InvoiceFactory;
import za.ac.cput.service.impl.InvoiceService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("invoice")
public class InvoiceController {
    @Autowired
    private InvoiceService invoiceService;

    @PostMapping("create")
    public Invoice create(@RequestBody Invoice invoice){
        Invoice created = InvoiceFactory.builddInvoice("10", 500, "chris", new Date(2025,3,8));
        return invoiceService.create(invoice);
    }

    @GetMapping("/read/{id}")
    public Invoice read(@PathVariable String id){
        return invoiceService.read(id);
    }

    @PostMapping("/update")
    public Invoice update(@RequestBody Invoice invoice){
        return invoiceService.update(invoice);
    }
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id ){
        return invoiceService.delete(id);
    }

    @GetMapping({"/getAll"})
    public List<Invoice> getAll(){
        return  invoiceService.getAll();
    }
}
