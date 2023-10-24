//package za.ac.cput.controller;
//
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import za.ac.cput.domain.Booking;
//import za.ac.cput.factory.BookingFactory;
//
//import java.util.Date;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//
//
//class BookingControllerTest {
//
//    private  static final Booking booking = BookingFactory.createBooking( new Date(2025, 3, 8)
//            ,new Date(2025, 12, 8)
//            ,new Date(2023, 6, 8)
//            ,true,25);
//
//    @Autowired
//    public TestRestTemplate restTemplate;
//
//    public final String baseURL = "http://localhost:8080/booking";
//
//    @Test
//    @Order(1)
//    void create() {
//        String url = baseURL + "/create";
//        ResponseEntity<Booking> postResponse =
//                restTemplate.postForEntity(url, booking, Booking.class);
//        assertNotNull(postResponse);
//        assertNotNull(postResponse.getBody());
//        assertEquals(booking.getBookingNumber(), postResponse.getBody().getBookingNumber());
//        System.out.println("Saved data: " + postResponse.getBody());
//    }
//
//    @Test
//    @Order(2)
//    void delete() {
//        String url = baseURL + "/delete/" + booking.getBookingNumber();
//        System.out.println("URL: " + url);
//        restTemplate.delete(url);
//    }
//
//    @Test
//    @Order(3)
//    void getAll() {
//        String url = baseURL + "/getall";
//        HttpHeaders headers = new HttpHeaders();
//        HttpEntity<String> entity = new HttpEntity<>(null, headers);
//        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
//        System.out.println("Show all data: ");
//        System.out.println(response);
//        System.out.println(response.getBody());
//    }
//}