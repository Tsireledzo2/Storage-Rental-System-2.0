/**
 * invoice.java
 * This is the model or worker class
 * @author christian mukuna mbuyi
 * 06/06/2023
 */

package za.ac.cput.domain;

import java.time.LocalDate;
import java.util.Date;

public class Invoice {
    private String invoiceNumber;
    private double amount;
    private Date invoiceDate;

    private  Invoice(){}

    private Invoice(Builder builder){
        this.invoiceNumber = builder.invoiceNumber;
        this.amount = builder.amount;
        this.invoiceDate = builder.invoiceDate;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public double getAmount() {
        return amount;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceNumber =" + invoiceNumber +
                ", amount=" + amount +
                ", Date='" + invoiceDate + '\'' +
                '}';
    }

    public  static class Builder{
        private String invoiceNumber;
        private double amount;
        private Date invoiceDate;

        public  Builder setInvoiceNumber(String invoiceNumber){
            this.invoiceNumber = invoiceNumber;
            return this;
        }
        public  Builder setAmount(double amount){
            this.amount = amount;
            return this;
        }
        public  Builder setInvoiceDate(Date invoiceDate){
            this.invoiceDate = invoiceDate;
            return this;
        }

        public Builder copy(Invoice invoice){
            this.invoiceNumber = invoice.invoiceNumber;
            this.amount = invoice.amount;
            this.invoiceDate = invoice.invoiceDate;
            return this;
        }
        public Invoice build(){
            return new Invoice(this);
        }

    }
}
