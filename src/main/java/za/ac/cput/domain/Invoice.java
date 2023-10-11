/**
 * invoice.java
 * This is the model or worker class
 * @author christian mukuna mbuyi
 * 06/06/2023
 */

package za.ac.cput.domain;

import jakarta.persistence.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Invoice {
    @Id
    private String invoiceNumber;
    private double totalAmount;
    private String customerName;
    private Date invoiceDate;

    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL)
    private List<InvoiceLine> invoiceLines;


    public Invoice() {
    }
    public Invoice(Builder builder) {
        this.invoiceNumber = builder.invoiceNumber;
        this.customerName = builder.customerName;
        this.totalAmount = builder.totalAmount;
        this.invoiceDate = builder.invoiceDate;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public String getFormattedInvoiceDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Define your desired date format here
        return dateFormat.format(invoiceDate);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return Double.compare(invoice.totalAmount, totalAmount) == 0 && Objects.equals(invoiceNumber, invoice.invoiceNumber) && Objects.equals(customerName, invoice.customerName) && Objects.equals(invoiceDate, invoice.invoiceDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoiceNumber, totalAmount, customerName, invoiceDate);
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceNumber='" + invoiceNumber + '\'' +
                ", totalAmount=" + totalAmount +
                ", customerName='" + customerName + '\'' +
                ", invoiceDate=" + invoiceDate +
                '}';
    }

    public static class Builder{
        private String invoiceNumber;
        private double totalAmount;
        private String customerName;
        private Date invoiceDate;

        public Builder setInvoiceNumber(String invoiceNumber) {
            this.invoiceNumber = invoiceNumber;
            return this;
        }

        public Builder setTotalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public Builder setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Builder setInvoiceDate(Date invoiceDate) {
            this.invoiceDate = invoiceDate;
            return this;
        }

        public Builder copy(Invoice invoice){
            this.invoiceNumber = invoice.invoiceNumber;
            this.customerName = invoice.customerName;
            this.totalAmount = invoice.totalAmount;
            this.invoiceDate = invoice.invoiceDate;
            return this;
        }

        public Invoice build(){
            return new Invoice(this);
        }
    }
}
