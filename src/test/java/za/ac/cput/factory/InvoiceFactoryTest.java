package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Invoice;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
class InvoiceFactoryTest {
    @Test
    public void testCreateInvoiceSuccess(){
//        Invoice invoice = InvoiceFactory. (200, new Date(2025,3,8));
        Invoice invoice = InvoiceFactory.builddInvoice("10", 500, "chris", new Date(2025,3,8));
        System.out.println(invoice);
        assertNotNull(invoice);

    }

    @Test
    public void testCreateInvoiceIdentity(){
        Invoice invoice = InvoiceFactory.builddInvoice("11", 40, "mukuna", new Date(2025,3,8));
        System.out.println(invoice);

        Invoice invoice2 = InvoiceFactory.builddInvoice("10", 500, "mbuyi", new Date(2025,3,8));
        System.out.println(invoice);
        assertNotSame(invoice2,invoice,"passed");

    }

    @Test
    public void testObjectFailing() {
        Invoice invoice = InvoiceFactory.builddInvoice("10", 500, "christian", new Date(2025,3,8));
        System.out.println(invoice);
        assertNotNull(invoice);

    }


  
}