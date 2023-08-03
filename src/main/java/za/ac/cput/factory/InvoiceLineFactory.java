/**
 * ivoiceLinefactory.java
 * This is the model or worker class
 * @author christian mukuna mbuyi
 * 06/06/2023
 */
package za.ac.cput.factory;

import za.ac.cput.domain.InvoiceLine;

public class InvoiceLineFactory {

    public static InvoiceLine buildInvoiceLine(String invoiceLineId, String serviceDescription,int quantity,double unitPrice,double lineTotalAmount ){

        InvoiceLine invoiceLine = new InvoiceLine.Builder()
                .setInvoiceLineId(invoiceLineId)
                .setServiceDescription(serviceDescription)
                .setQuantity(quantity)
                .setUnitPrice(unitPrice)
                .setLineTotalAmount(lineTotalAmount)
                .build();
        return invoiceLine;
    }
}
