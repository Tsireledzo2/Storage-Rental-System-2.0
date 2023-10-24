//package za.ac.cput.service.impl;
//
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import za.ac.cput.domain.InvoiceLine;
//import za.ac.cput.factory.InvoiceLineFactory;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//@TestMethodOrder(MethodOrderer.MethodName.class)
//
//class InvoiceLineServiceimplTest {
//    private static InvoiceLineServiceimpl serviceimpl = null;
//
//    private static List addToList(){
//        List<String> list = new ArrayList<>();
//        list.add("iphone1");
//        list.add("iphone2");
//        list.add("iphone3");
//
//
//        return list;
//    }
//    private static InvoiceLine invoiceLine = InvoiceLineFactory.createInvoiceLine(addToList());
//    public InvoiceLineServiceimplTest(){
//        serviceimpl = InvoiceLineServiceimpl.getInstance();
//
//    }
//
//    @Test
//    void a_create(){
//        InvoiceLine created = serviceimpl.create(invoiceLine);
//        assertNotNull(created);
//        System.out.println(created);
//    }
//
//    @Test
//    void b_delete() {
//        boolean success = serviceimpl.delete(invoiceLine.getInvoiceListNumber());
//        assertTrue(success);
//        System.out.println("Deleted"+ success);
//    }
//
//    @Test
//    void c_getAll() {
//        System.out.println("Show All");
//        System.out.println(serviceimpl.getAll());
//    }
//}