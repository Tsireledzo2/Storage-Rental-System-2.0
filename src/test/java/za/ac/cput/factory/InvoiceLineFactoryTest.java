package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.InvoiceLine;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceLineFactoryTest {
    @Test
    void testCreateIncoiceLineSucces(){
        InvoiceLine invoiceLine = InvoiceLineFactory.buildInvoiceLine("10","new",10, 12.3,52.3);
        System.out.println(invoiceLine);
        assertNotNull(invoiceLine);


    }

    @Test
    void testCreateIncoiceLineFail(){
        InvoiceLine invoiceLine = InvoiceLineFactory.buildInvoiceLine("","new",10, 12.3,52.3);
        System.out.println(invoiceLine);
        assertNotNull(invoiceLine,"Value connet be empty");


    }

}