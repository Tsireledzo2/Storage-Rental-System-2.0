package za.ac.cput.domain;

/*
 * Booking.java
 * Booking Entity
 * @author: Argus Hakizimana Mbogo (220073260)
 * Date: 07 April 2023
 */

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
public class Booking {
    @Id
    @GeneratedValue
    private Long bookingNumber;
    private Date bookingDate;
    private Date startDate;
    private Date endDate;
    private boolean collection;
    private double totalAmount;

//    @OneToOne
//    @JoinColumn(name = "email")
//    private Customer customer;
//
//    @OneToOne
//    @JoinColumn(name = "unitId")
//    private StorageUnit storageUnit;

    public Booking() {
    }



    private Booking(Builder builder) {
        this.bookingNumber = builder.bookingNumber;
        this.bookingDate = builder.bookingDate;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.collection = builder.collection;
        this.totalAmount = builder.totalAmount;
//        this.customer = builder.customer;
//        this.storageUnit = builder.storageUnit;

    }

    public Long getBookingNumber() {
        return bookingNumber;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public boolean isCollection() {
        return collection;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public StorageUnit getStorageUnit() {
//        return storageUnit;
//    }

    @Override
    public String toString() {
        return "Booking{" +
                "Booking Number='" + bookingNumber + '\'' +
                ", Booking Date=" + bookingDate +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", collection=" + collection +
                ", Total Amount=" + totalAmount +
                '}';
    }


    public static class Builder {

        private Long bookingNumber;
        private Date bookingDate, startDate, endDate;
        private boolean collection;
        private double totalAmount;
        private Customer customer;
        private StorageUnit storageUnit;

        public Builder setBookingNumber(Long bookingNumber) {
            this.bookingNumber = bookingNumber;
            return this;
        }

        public Builder setBookingDate(Date bookingDate) {
            this.bookingDate = bookingDate;
            return this;
        }

        public Builder setStartDate(Date startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder setEndDate(Date endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder setCollection(boolean collection) {
            this.collection = collection;
            return this;
        }

        public Builder setTotalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public Builder setCustomer(Customer customer) {
            this.customer = customer;
            return this;
        }

        public Builder setStorageUnit(StorageUnit storageUnit) {
            this.storageUnit = storageUnit;
            return this;
        }

        public Builder copy(Booking booking) {
            this.bookingNumber = booking.bookingNumber;
            this.bookingDate = booking.bookingDate;
            this.startDate = booking.startDate;
            this.endDate = booking.endDate;
            this.collection = booking.collection;
            this.totalAmount = booking.totalAmount;
//            this.customer = booking.customer;
//            this.storageUnit = booking.storageUnit;
            return this;
        }

        public Booking build() {
            return new Booking(this);
        }
    }
}