/**
 * invoice.java
 * This is the model or worker class
 * @author christian mukuna mbuyi
 * 06/06/2023
 */

package za.ac.cput.domain;

import java.util.Date;

public class Invoice {
    private String invoiceNumber;
    private double amount;
    private Date LocalDate;

    private  Invoice(){}

    private Invoice(Builder builder){
        this.invoiceNumber = builder.invoiceNumber;
        this.amount = builder.amount;
        this.LocalDate = builder.LocalDate;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public double getAmount() {
        return amount;
    }

    public Date getLocalDate() {
        return LocalDate;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceNumber =" + invoiceNumber +
                ", amount=" + amount +
                ", LocalDate='" + LocalDate + '\'' +
                '}';
    }

    public  static class Builder{
        private String invoiceNumber;
        private double amount;
        private Date LocalDate;

        public  Builder setInvoiceNumber(String invoiceNumber){
            this.invoiceNumber = invoiceNumber;
            return this;
        }
        public  Builder setAmount(double amount){
            this.amount = amount;
            return this;
        }
        public  Builder setLocalDate(Date LocalDate){
            this.LocalDate = LocalDate;
            return this;
        }

        public Builder copy(Invoice invoice){
            this.invoiceNumber = invoice.invoiceNumber;
            this.amount = invoice.amount;
            this.LocalDate = invoice.LocalDate;
            return this;
        }
        public Invoice build(){
            return new Invoice(this);
        }

    }
}
