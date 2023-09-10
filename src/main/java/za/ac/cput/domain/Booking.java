package za.ac.cput.domain;

/*
 * Booking.java
 * Booking Entity
 * @author: Argus Hakizimana Mbogo (220073260)
 * Date: 07 April 2023
 */

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Entity
public class Booking {
    @Id
    private String bookingNumber;
    private Date bookingDate;
    private Date startDate;
    private Date endDate;
    private boolean collection;
    private double totalAmount;

    public Booking() {
    }

    public Booking(Date bookingDate, Date startDate, Date endDate, boolean collection, double totalAmount) {
        this.bookingDate = bookingDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.collection = collection;
        this.totalAmount = totalAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return collection == booking.collection
                && Double.compare(booking.totalAmount, totalAmount) == 0
                && Objects.equals(bookingNumber, booking.bookingNumber)
                && Objects.equals(bookingDate, booking.bookingDate)
                && Objects.equals(startDate, booking.startDate)
                && Objects.equals(endDate, booking.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingNumber, bookingDate, startDate, endDate, collection, totalAmount);
    }

    private Booking(Builder builder) {
        this.bookingNumber = builder.bookingNumber;
        this.bookingDate = builder.bookingDate;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.collection = builder.collection;
        this.totalAmount = builder.totalAmount;

    }

    public String getBookingNumber() {
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

        private String bookingNumber;
        private Date bookingDate, startDate, endDate;
        private boolean collection;
        private double totalAmount;

        public Builder setBookingNumber(String bookingNumber) {
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

        public Builder copy(Booking booking) {
            this.bookingNumber = booking.bookingNumber;
            this.bookingDate = booking.bookingDate;
            this.startDate = booking.startDate;
            this.endDate = booking.endDate;
            this.collection = booking.collection;
            this.totalAmount = booking.totalAmount;
            return this;
        }

        public Booking build() {
            return new Booking(this);
        }
    }
}


