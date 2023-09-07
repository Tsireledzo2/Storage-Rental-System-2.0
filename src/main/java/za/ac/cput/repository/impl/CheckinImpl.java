
//package za.ac.cput.repository.impl;
//
///*
// * CheckinImpl.java
// * CheckinImpl Entity
// * @author: Argus Hakizimana Mbogo (220073260)
// * Date: 09 June 2023
// */
//
//import za.ac.cput.domain.Checkin;
//import za.ac.cput.repository.ICheckinRepository;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class CheckinImpl implements ICheckinRepository {
//
//    private static CheckinImpl repository = null;
//
//    private Set<Checkin> checkinDb;
//
//    private CheckinImpl() {
//        checkinDb = new HashSet<>();
//    }
//
//    public static CheckinImpl getRepository() {
//        return (repository == null)? repository = new CheckinImpl(): repository;
//    }
//
//
//    @Override
//    public Checkin create(Checkin checkin) {
//        boolean added = checkinDb.add(checkin);
//        return (!added)? null : checkin;
//    }
//
//    @Override
//    public Checkin read(String s) {
//        return checkinDb.stream().filter(Check -> Check.getDriverStatus().equals(s)).findFirst().orElse(null);
//    }
//
//    @Override
//    public Checkin update(Checkin checkin) {
//        Checkin checedin = read(checkin.getDriverStatus());
//        return (checedin != null)?
//                (checkinDb.remove(checedin) && checkinDb.add(checedin)) ?
//                        checkin :null:null;
//    }
//
//    @Override
//    public boolean delete(String s) {
//        Checkin deleteCheckin = read(s);
//        return deleteCheckin != null && (checkinDb.remove(deleteCheckin));
//    }
//
//    @Override
//    public Set<Checkin> getAll() {
//        return checkinDb;
//    }
//}

