/**
 * ivoiceLinefactory.java
 * This is the model or worker class
 * @author christian mukuna mbuyi
 * 06/06/2023
 */
package za.ac.cput.factory;

import za.ac.cput.domain.InvoiceLine;
import za.ac.cput.util.Helper;

import java.util.List;
//ar
public class InvoiceLineFactory {
    public static InvoiceLine createInvoiceLine(List invoiceline){
        if (Helper.isNullorEmpty2(invoiceline)){
            return null;
        }
        String invoicelineNumber = Helper.generateId();

        InvoiceLine invoiceLine = new InvoiceLine.Builder()
                .setInvoiceListNumber(invoicelineNumber)
                .setInvoiceline(invoiceline)
                .build();
        return invoiceLine;
    }
}
