/**
 * ivoiceList.java
 * This is the model or worker class
 * @author christian mukuna mbuyi
 * 06/06/2023
 */
package za.ac.cput.domain;

import java.util.List;

public class InvoiceLine {
    private String invoiceListNumber;
    private List invoiceline;

    private InvoiceLine(){}

    private InvoiceLine(Builder builder){
        this.invoiceListNumber = builder.invoiceListNumber;
        this.invoiceline = builder.invoiceline;
    }


    public String getInvoiceListNumber() {
        return invoiceListNumber;
    }


    public List getInvoiceline() {
        return invoiceline;
    }

    @Override
    public String toString() {
        return "InvoiceList{" +
                "invoiceListNumber=" + invoiceListNumber +
                ", invoiceline=" + invoiceline +
                '}';
    }

    public static class Builder{

        private String invoiceListNumber;
        private List invoiceline;

        public  Builder setInvoiceListNumber(String invoiceListNumber){
            this.invoiceListNumber = invoiceListNumber;
            return this;
        }


        public  Builder setInvoiceline(List invoiceline){
            this.invoiceline = invoiceline;
            return this;
        }

        public Builder copy(InvoiceLine invoiceList){
            this.invoiceListNumber = invoiceList.invoiceListNumber;
            this.invoiceline = invoiceList.invoiceline;
            return this;
        }
        public InvoiceLine build(){
            return new InvoiceLine(this);
        }
    }
}
