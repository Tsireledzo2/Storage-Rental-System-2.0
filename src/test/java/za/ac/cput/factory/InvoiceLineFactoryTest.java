package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.InvoiceLine;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceLineFactoryTest {
    @Test
    void testCreateIncoiceLineSucces(){
        List<String> list = new ArrayList<>();
        list.add("NUGGET");
        InvoiceLine invoiceLine = InvoiceLineFactory.createInvoiceLine(list);
        System.out.println(invoiceLine);
        assertNotNull(invoiceLine);
        list.add("IPHONE");

    }

    @Test
    void testCreateIncoiceLineFail(){
        List<String> list = new ArrayList<>();
        InvoiceLine invoiceLine = InvoiceLineFactory.createInvoiceLine(list);
        System.out.println(invoiceLine);
        assertNotNull(invoiceLine,"Value connet be empty");


    }

}