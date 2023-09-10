///*
//AdminImpl.java
//This is the AdminImpl class
//author : Lithemba Nkqayi(220558558)
//Date : 11 June 2023
// */
//package za.ac.cput.repository.impl;
//
//import za.ac.cput.domain.Admin;
//import za.ac.cput.repository.IAdminRepository;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class AdminImpl implements IAdminRepository{
//   private static AdminImpl adminRepository = null;
//   private Set<Admin> adminDB;
//   private AdminImpl(){
//       adminDB = new HashSet<Admin>();
//   }
//   public static AdminImpl getAdminRepository(){
//       if(adminRepository == null){
//           adminRepository = new AdminImpl();
//       }
//       return adminRepository;
//   }
//    @Override
//    public Admin create(Admin admin) {
//       boolean success = adminDB.add(admin);
//        System.out.println("Admin:" +adminDB);
//        if(!success)
//        return null;
//        return admin;
//    }
//
//    @Override
//    public Admin read(String adminID) {
//       Admin admin = adminDB.stream().filter(admin1 -> admin1.getAdminID().equals(adminID))
//               .findAny()
//               .orElse(null);
//
//        return admin;
//    }
//
//    @Override
//    public Admin update(Admin admin) {
//       Admin oldAdmin = read(admin.getAdminID());
//       if(oldAdmin != null){
//           adminDB.remove(oldAdmin);
//           adminDB.add(admin);
//           return admin;
//       }
//        return null;
//    }
//
//    @Override
//    public boolean delete(String adminID) {
//       Admin adminToDelete = read(adminID);
//       if(adminToDelete == null)
//        return false;
//       adminDB.remove(adminToDelete);
//       return true;
//    }
//
//    @Override
//    public Set<Admin> getAll() {
//        return adminDB;
//    }
//}
