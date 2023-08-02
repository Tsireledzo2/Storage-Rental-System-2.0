/**
 * ivoicefactoey.java
 * This is the model or worker class
 * @author christian mukuna mbuyi
 * 06/06/2023
 */
package za.ac.cput.factory;

import za.ac.cput.domain.Invoice;

import java.util.Date;

public class InvoiceFactory {
    public static Invoice builddInvoice(String invoiceNumber, double totalAmount, String customerName, Date invoiceDate){

        Invoice invoice = new Invoice.Builder()
                .setInvoiceNumber(invoiceNumber)
                .setTotalAmount(totalAmount)
                .setCustomerName(customerName)
                .setInvoiceDate(invoiceDate)
                .build();
        return invoice;
    }
}
