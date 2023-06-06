package za.ac.cput.Factory;

import za.ac.cput.domain.Checkout;

public class CheckoutFactory {
 public static Checkout createCheckout(boolean driverStatus, boolean vehicleStatus) {

     Checkout checkout = new Checkout.Builder()
             .setDriverStatus(driverStatus)
             .setVehicleStatus(vehicleStatus)
             .build();
     return checkout;

 }
}
