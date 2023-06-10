package za.ac.cput.factory;

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
