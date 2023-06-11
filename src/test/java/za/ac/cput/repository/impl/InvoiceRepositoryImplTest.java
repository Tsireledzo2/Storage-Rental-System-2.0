package za.ac.cput.repository.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Invoice;
import za.ac.cput.factory.InvoiceFactory;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

class InvoiceRepositoryImplTest {
    private static InvoiceRepositoryImpl invoiceRepository = InvoiceRepositoryImpl.getInvoiceRepository();
    private static Invoice invoice = InvoiceFactory.buildInvoice(100, new Date(2025,3,8));



    @Test
    void a_create() {
        Invoice createInvoice = invoiceRepository.create(invoice);
        assertNotNull(invoice.getInvoiceNumber(), invoice.getInvoiceNumber());
        System.out.println("Create: "+ createInvoice);

    }

    @Test
    void b_read() {
        Invoice readInvoice = invoiceRepository.read(invoice.getInvoiceNumber());
        assertNotNull(readInvoice);
        System.out.println("Read: "+ readInvoice);
    }

    @Test
    void c_update() {
        Invoice updateInvoice = new Invoice.Builder()
                .copy(invoice)
                .setAmount(600)
                .setInvoiceDate(new Date(2023,12,8))
                .build();
        assertNotNull(invoiceRepository.update(invoice));
        System.out.println("Update: "+ updateInvoice);
    }

    @Test
    void d_delete() {
        boolean success = invoiceRepository.delete(invoice.getInvoiceNumber());
        assertTrue(success);
        System.out.println("Delete: "+ success);
    }

    @Test
    void e_getAll() {
        System.out.println("Get all: "+ invoiceRepository.getAll());
    }
}
