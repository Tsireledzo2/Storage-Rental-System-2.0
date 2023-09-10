/**
 * ivoiceLine.java
 * This is the model or worker class
 * @author christian mukuna mbuyi
 * 06/06/2023
 */
package za.ac.cput.domain;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "invoice_line")
public class InvoiceLine {
    @Id
    private String invoiceLineId;
    private String serviceDescription;
    private int quantity;
    private double unitPrice;
    private double lineTotalAmount;

    @ManyToOne
    private Invoice invoice;
    public InvoiceLine() {
        //try
    }
    public InvoiceLine(Builder builder) {
        this.invoiceLineId = builder.invoiceLineId;
        this.serviceDescription = builder.serviceDescription;
        this.quantity = builder.quantity;
        this.unitPrice = builder.unitPrice;
        this.lineTotalAmount = builder.lineTotalAmount;
    }

    public String getInvoiceLineId() {
        return invoiceLineId;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getLineTotalAmount() {
        return lineTotalAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceLine that = (InvoiceLine) o;
        return quantity == that.quantity && Double.compare(that.unitPrice, unitPrice) == 0 && Double.compare(that.lineTotalAmount, lineTotalAmount) == 0 && Objects.equals(invoiceLineId, that.invoiceLineId) && Objects.equals(serviceDescription, that.serviceDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoiceLineId, serviceDescription, quantity, unitPrice, lineTotalAmount);
    }

    @Override
    public String toString() {
        return "InvoiceLine{" +
                "invoiceLineId='" + invoiceLineId + '\'' +
                ", serviceDescription='" + serviceDescription + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", lineTotalAmount=" + lineTotalAmount +
                '}';
    }

    public static class Builder{
        private String invoiceLineId;
        private String serviceDescription;
        private int quantity;
        private double unitPrice;
        private double lineTotalAmount;

        public Builder setInvoiceLineId(String invoiceLineId) {
            this.invoiceLineId = invoiceLineId;
            return this;
        }

        public Builder setServiceDescription(String serviceDescription) {
            this.serviceDescription = serviceDescription;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setUnitPrice(double unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }

        public Builder setLineTotalAmount(double lineTotalAmount) {
            this.lineTotalAmount = lineTotalAmount;
            return this;
        }

        public Builder copy(InvoiceLine invoiceLine){
            this.invoiceLineId = invoiceLine.invoiceLineId;
            this.serviceDescription = invoiceLine.serviceDescription;
            this.quantity = invoiceLine.quantity;
            this.unitPrice = invoiceLine.unitPrice;
            this.lineTotalAmount = invoiceLine.lineTotalAmount;
            return this;
        }

        public InvoiceLine build(){
            return new InvoiceLine(this);
        }
    }


}