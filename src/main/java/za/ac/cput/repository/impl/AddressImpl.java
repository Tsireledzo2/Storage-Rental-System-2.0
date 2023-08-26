///*
//Ndumiso Nkululeko Ngcobo
//220094861
// */
//
//package za.ac.cput.repository.impl;
//import za.ac.cput.domain.Address;
//import za.ac.cput.repository.IAddressRepository;
//import java.util.HashSet;
//import java.util.Set;
//
//public class AddressImpl implements IAddressRepository{
//
//    private static AddressImpl addressRepository = null;
//    private Set<Address> addressDB = null;
//    private AddressImpl(){
//        addressDB = new HashSet<Address>();
//    }
//
//    public static AddressImpl getAddressRepository(){
//        if (addressRepository == null){
//            addressRepository = new AddressImpl();
//        }
//        return addressRepository;
//    }
//
//    @Override
//    public Address create(Address address) {
//        boolean success = addressDB.add(address);
//        System.out.println("Address: " + addressDB );
//        if(!success)
//            return null;
//        return address;
//
//    }
//
//    @Override
//    public Address read(String streetNu) {
//        Address address = addressDB.stream()
//                .filter(address1 -> address1.getStreetNumber()
//                        .equals(streetNu))
//                .findAny()
//                .orElse(null);
//        return address;
//    }
//
//    @Override
//    public Address update(Address address) {
//        Address updateAddress = read(address.getStreetNumber());
//        if (updateAddress !=null){
//            addressDB.remove(updateAddress);
//            addressDB.add(address);
//            return address;
//        }
//        return null;
//    }
//
//    @Override
//    public boolean delete(String streetNu) {
//        Address deleteAddress = read(streetNu);
//        if (deleteAddress==null)
//            return false;
//        addressDB.remove(deleteAddress);
//        return true;
//    }
//
//    @Override
//    public Set<Address> getAll() {
//        return null;
//    }
//}
