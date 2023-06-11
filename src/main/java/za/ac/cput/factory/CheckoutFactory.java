package za.ac.cput.factory;

/*
 * CheckoutFactory.java
 * CheckoutFactory Entity
 * @author: Argus Hakizimana Mbogo (220073260)
 * Date: 09 June 2023
 */

import za.ac.cput.domain.Checkout;

public class CheckoutFactory {
    public static Checkout createCheckout(String driverStatus, String vehicleStatus) {

        Checkout checkout = new Checkout.Builder()
                .setDriverStatus(driverStatus)
                .setVehicleStatus(vehicleStatus)
                .build();
        return checkout;

    }
}