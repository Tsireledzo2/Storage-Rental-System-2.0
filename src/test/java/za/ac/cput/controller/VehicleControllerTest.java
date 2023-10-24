//package za.ac.cput.controller;
//
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import za.ac.cput.domain.Vehicle;
//import za.ac.cput.domain.VehicleType;
//import za.ac.cput.factory.VehicleFactory;
//import za.ac.cput.factory.VehicleTypeFactory;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@TestMethodOrder(MethodOrderer.MethodName.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//class VehicleControllerTest {
//
//    @Autowired
//    private TestRestTemplate restTemplate;
//
//    private String baseUrl ="http://localhost:8080";
//
//    VehicleType vehicleType = VehicleTypeFactory.buildVehicleType("Truck",123,300.00);
//    Vehicle vehicle = VehicleFactory.buildVehicle("LRS 001","D1.00","Black","2002","Toyota",vehicleType);
//    @Test
//    void a_create() {
//        String url = baseUrl +"/vehicle/createVehicle";
//        ResponseEntity<Vehicle> postResponse = restTemplate.postForEntity(url, vehicle,Vehicle.class);
//        assertNotNull(postResponse);
//        System.out.println(postResponse);
//        assertNotNull(postResponse.getBody());
//        Vehicle vehicle1 = postResponse.getBody();
//        System.out.println("Saved Vehicle " + vehicle1);
//        assertNotNull(vehicle1.getNumberPlate());
//    }
//
//    @Test
//    void b_read() {
//        String url = baseUrl +"/vehicle/getVehicle/" +vehicle.getNumberPlate();
//        System.out.println("URL " +url);
//        ResponseEntity<Vehicle> getResponse = restTemplate.getForEntity(url,Vehicle.class);
//        System.out.println(getResponse.getBody());
//        assertNotNull(getResponse.getBody());
//        assertEquals(vehicle.getNumberPlate(),getResponse.getBody().getNumberPlate());
//        System.out.println("Vehicle: " +getResponse.getBody());
//    }
//
//    @Test
//    void c_update() {
//        // no test
//    }
//
//    @Test
//    void e_delete() {
//        String url = baseUrl +"/vehicle/deleteVehicle/" +vehicle.getNumberPlate();
//        System.out.println("URL "+url);
//        restTemplate.delete(url);
//    }
//
//    @Test
//    void d_getAll() {
//        String url = baseUrl +"/vehicle/getAllVehicles";
//        HttpHeaders httpHeaders = new HttpHeaders();
//        HttpEntity<String> httpEntity = new HttpEntity<>(null,httpHeaders);
//        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET,httpEntity,String.class);
//        System.out.println("ALl Vehicles");
//        System.out.println(response);
//        System.out.println(response.getBody() +"\n");
//    }
//}