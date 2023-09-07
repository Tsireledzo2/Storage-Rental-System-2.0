//package za.ac.cput.repository.impl;
///*
// * CheckoutImpl.java
// * CheckoutImpl Entity
// * @author: Argus Hakizimana Mbogo (220073260)
// * Date: 09 June 2023
// */
//
//import za.ac.cput.domain.Checkout;
//import za.ac.cput.repository.ICheckoutRepository;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class CheckoutImpl implements ICheckoutRepository {
//
//    private static CheckoutImpl checkOutRepository = null;
//
//    private Set<Checkout> checkoutDb;
//
//    public CheckoutImpl() {
//        checkoutDb = new HashSet<>();
//    }
//
//    public static CheckoutImpl getCheckOutRepository() {
//        return (checkOutRepository == null)? checkOutRepository = new CheckoutImpl() : checkOutRepository;
//    }
//
//
//    @Override
//    public Checkout create(Checkout checkout) {
//       boolean added = checkoutDb.add(checkout);
//       return (!added)? null : checkout;
//    }
//
//    @Override
//    public Checkout read(String id) {
//        return checkoutDb.stream().filter(Checkout -> Checkout.getDriverStatus().equals(id) ).findFirst().orElse(null);
//    }
//
//    @Override
//    public Checkout update(Checkout checkout) {
//        Checkout oldCheckout = read(checkout.getDriverStatus());
//        return (oldCheckout != null) ?
//                (checkoutDb.remove(oldCheckout)&& checkoutDb.add(oldCheckout)) ?
//                        checkout:null:null;
//    }
//
//    @Override
//    public boolean delete(String s) {
//       Checkout deleteCheckout = read(s);
//       return deleteCheckout != null && (checkoutDb.remove(deleteCheckout));
//    }
//
//    @Override
//    public Set<Checkout> getAll() {
//        return checkoutDb;
//    }
//}

