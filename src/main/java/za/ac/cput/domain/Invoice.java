/**
 * invoice.java
 * This is the model or worker class
 * @author christian mukuna mbuyi
 * 06/06/2023
 */

package za.ac.cput.domain;

import jakarta.persistence.*;

import java.time.LocalDate;
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

    @OneToOne
    @JoinColumn(name = "CustomerEmail")
    private Customer customer;

    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL)
    private List<InvoiceLine> invoiceLines;


    public Invoice() {
    }
    public Invoice(Builder builder) {
        this.invoiceNumber = builder.invoiceNumber;
        this.customerName = builder.customerName;
        this.totalAmount = builder.totalAmount;
        this.invoiceDate = builder.invoiceDate;
        this.customer = builder.customer;
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

    public Customer getCustomer() {
        return customer;
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
        private Customer customer;

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

        public Builder setCustomer(Customer customer) {
            this.customer = customer;
            return this;
        }

        public Builder Copy(Invoice invoice){
            this.invoiceNumber = invoice.invoiceNumber;
            this.customerName = invoice.customerName;
            this.totalAmount = invoice.totalAmount;
            this.invoiceDate = invoice.invoiceDate;
            this.customer = invoice.customer;
            return this;
        }

        public Invoice build(){
            return new Invoice(this);
        }
    }
}
