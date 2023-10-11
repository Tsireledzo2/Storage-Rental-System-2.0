package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Invoice;
import za.ac.cput.service.impl.InvoiceService;

import java.util.List;

@RestController
@RequestMapping("invoice")
public class InvoiceController {
    @Autowired
    private InvoiceService invoiceService;

    @PostMapping("create")
    public Invoice create(@RequestBody Invoice invoice){
//        Invoice created = InvoiceFactory.builddInvoice("10", 300, "chris", new Date(2025,3,8));
        return invoiceService.create(invoice);
    }

    @GetMapping("/read/{id}")
    public ResponseEntity<Invoice> read(@PathVariable String id){
        Invoice invoice = invoiceService.read(id);
        if (invoice != null) {
            String formattedDate = invoice.getFormattedInvoiceDate(); // Get the formatted date
            return ResponseEntity.ok(invoice);
        } else {
            return ResponseEntity.notFound().build();
        }
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
        List<Invoice> invoices = invoiceService.getAll();

        // Format the invoiceDate for all invoices in the list
        for (Invoice invoice : invoices) {
            String formattedDate = invoice.getFormattedInvoiceDate(); // Get the formatted date
        }

        return invoices;
    }
}
