package za.ac.cput.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Admin;
import za.ac.cput.domain.Driver;
import za.ac.cput.domain.Employee;
import za.ac.cput.factory.AdminFactory;
import za.ac.cput.factory.DriverFactory;
import za.ac.cput.factory.EmployeeFactory;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AdminControllerTest {
    public Employee employee = EmployeeFactory.buildEmployee("A2345","Lily","Zee","zee@gmail.com","6644");
    public Admin admin = AdminFactory.createAdmin("345","Admin",employee);
    @Autowired
    private TestRestTemplate restTemplate;

    private String baseUrl ="http://localhost:8080";
    @Test
    void a_create() {
        String urlE = baseUrl +"/createEmployee";
        ResponseEntity<Employee> postResponseE = restTemplate.postForEntity(urlE, employee,Employee.class);
        String url = baseUrl +"/admin/createAdmin";
        ResponseEntity<Admin> postResponse = restTemplate.postForEntity(url, admin,Admin.class);
        assertNotNull(postResponse);
        System.out.println(postResponse);
        assertNotNull(postResponse.getBody());
        Admin admin1 = postResponse.getBody();
        System.out.println("Saved Admin " + admin1);
        assertNotNull(admin1.getAdminID());
    }

    @Test
    void b_read() {
        String url = baseUrl +"/admin/getAdmin/" +admin.getAdminID();
        System.out.println("URL " +url);
        ResponseEntity<Admin> getResponse = restTemplate.getForEntity(url,Admin.class);
        System.out.println(getResponse.getBody());
        assertNotNull(getResponse.getBody());
        assertEquals(admin.getAdminID(),getResponse.getBody().getAdminID());
        System.out.println("Admin: " +getResponse.getBody());
    }

    @Test
    void delete() {
        String url = baseUrl +"/admin/deleteAdmin/" +admin.getAdminID();
        System.out.println("URL "+url);
        restTemplate.delete(url);
    }

    @Test
    void c_getAll() {
        String url = baseUrl +"/admin/getAllAdmins";
        HttpHeaders httpHeaders = new HttpHeaders();
        HttpEntity<String> httpEntity = new HttpEntity<>(null,httpHeaders);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET,httpEntity,String.class);
        System.out.println("ALl Admins");
        System.out.println(response);
        System.out.println(response.getBody() +"\n");
    }
}