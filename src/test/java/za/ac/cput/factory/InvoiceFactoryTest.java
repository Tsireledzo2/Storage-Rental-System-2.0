package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Invoice;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
class InvoiceFactoryTest {
    @Test
    public void testCreateInvoiceSuccess(){
        Invoice invoice = InvoiceFactory.buildInvoice(200, new Date(2025,3,8));
        System.out.println(invoice);
        assertNotNull(invoice);

    }

    @Test
    public void testCreateInvoiceIdentity(){
        Invoice invoice = InvoiceFactory.buildInvoice(100, new Date(2025,3,8));
        System.out.println(invoice);

        Invoice invoice2 = InvoiceFactory.buildInvoice(200, new Date(2025,3,8));
        System.out.println(invoice);
        assertNotSame(invoice2,invoice,"passed");

    }

    @Test
    public void testObjectFailing() {
        Invoice invoice = InvoiceFactory.buildInvoice(100, new Date(2025,3,5));
        System.out.println(invoice);
        assertNotNull(invoice);

    }


  
}