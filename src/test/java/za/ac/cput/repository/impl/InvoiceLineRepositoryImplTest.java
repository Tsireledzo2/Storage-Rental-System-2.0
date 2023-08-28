package za.ac.cput.repository.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.InvoiceLine;
import za.ac.cput.factory.InvoiceLineFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

class InvoiceLineRepositoryImplTest {
    private static InvoiceLineRepositoryImpl InvoiceLineRepository = InvoiceLineRepositoryImpl.getRepository();
    private static List addToList(){
        List<String> list = new ArrayList<>();
        list.add("iphone1");
        list.add("iphone2");
        list.add("iphone3");


        return list;
    }
    private static InvoiceLine invoiceLine = InvoiceLineFactory.createInvoiceLine(addToList());



    @Test
    void a_create() {
        InvoiceLine createInvoiceLine = InvoiceLineRepository.create(invoiceLine);
        assertNotNull(invoiceLine.getInvoiceline());
        System.out.println("create: "+ createInvoiceLine);
    }

    @Test
    void b_read() {
        InvoiceLine readInvoiceLine = InvoiceLineRepository.read(invoiceLine.getInvoiceListNumber());
        assertNotNull(readInvoiceLine);
        System.out.println("Raed:"+ readInvoiceLine);
    }

    @Test
    void c_update() {
        List<String> list = new ArrayList<>();
        list.add("iphone12");
        list.add("iphone13");
        InvoiceLine updateInvoiceLine = new InvoiceLine.Builder().copy(invoiceLine)
                .setInvoiceline(list)
                .build();
        assertNotNull(InvoiceLineRepository.update(invoiceLine));
        System.out.println("Update: "+ updateInvoiceLine);
    }

    @Test
    void d_delete() {
        boolean success = InvoiceLineRepository.delete(invoiceLine.getInvoiceListNumber());
        assertTrue(success);
        System.out.println("Delete: "+ success);
    }

    @Test
    void e_getAll() {
        System.out.println("Get all: "+InvoiceLineRepository.getAll());
    }
}