/**
 * ivoicefactoey.java
 * This is the model or worker class
 * @author christian mukuna mbuyi
 * 06/06/2023
 */
package za.ac.cput.factory;

import za.ac.cput.domain.Invoice;
import za.ac.cput.util.Helper;

import java.util.Date;

public class InvoiceFactory {
    public static Invoice buildInvoice(double amount, LocalDate LocalDate){
        if (Helper.isNullorEmpty3(amount)|| Helper.isNullorEmpty(LocalDate)){
            return null;
        }
        String invoiceNumber = Helper.generateId();

        Invoice invoice = new Invoice.Builder()
                .setInvoiceNumber(invoiceNumber)
                .setAmount(amount)
                .setLocalDate(LocalDate)
                .build();
        return invoice;
    }
}
