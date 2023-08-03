package za.ac.cput.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Invoice;
import za.ac.cput.factory.InvoiceFactory;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

class InvoiceServiceimplTest {
    private static InvoiceServiceimpl serviceimpl = null;
    private static Invoice invoice = InvoiceFactory.buildInvoice(100, new Date(2025,3,8));
    public InvoiceServiceimplTest(){
        serviceimpl = InvoiceServiceimpl.getInstance();
    }

    @Test
    void a_create() {
        Invoice created = serviceimpl.create(invoice);
    }
    @Test
    void b_delete() {
        boolean success = serviceimpl.delete(invoice.getInvoiceNumber());
        assertTrue(success);
        System.out.println("deleted"+ success);
    }

    @Test
    void c_getAll() {
        System.out.println("show all");
        System.out.println(serviceimpl.getAll());
    }
}