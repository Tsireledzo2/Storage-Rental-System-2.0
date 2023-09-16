package za.ac.cput.controller;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import za.ac.cput.domain.Employee;
import za.ac.cput.factory.EmployeeFactory;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class EmployeeControllerTest {
    public Employee employee = EmployeeFactory.buildEmployee("A4567","Nolhi","Lhi","lili@gmail.com","3422");
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseUrl ="http://localhost:8080";
    @Test
    void a_create() {
        String employeeUrl = baseUrl +"/createEmployee";
        ResponseEntity<Employee> postResponse = restTemplate.postForEntity(employeeUrl,employee,Employee.class);
        assertNotNull(postResponse);
        System.out.println(postResponse);
    }
    @Test
    void b_read() {
        String url = baseUrl +"/getEmployee/" +employee.getEmployeeNumber();
        System.out.println("URL " +url);
        ResponseEntity<Employee> getResponse = restTemplate.getForEntity(url,Employee.class);
        System.out.println(getResponse.getBody());
        assertNotNull(getResponse.getBody());
        System.out.println("Employee: " +getResponse.getBody());
    }

    @Test
    void f_delete() {
        String url = baseUrl +"/employee/deleteEmployee/" +employee.getEmployeeNumber();
        System.out.println("URL "+url);
        restTemplate.delete(url);
    }

    @Test
    void getAll() {
        String url = baseUrl +"/employee/getAllEmployee";
        HttpHeaders httpHeaders = new HttpHeaders();
        HttpEntity<String> httpEntity = new HttpEntity<>(null,httpHeaders);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET,httpEntity,String.class);
        System.out.println("ALl Employees");
        System.out.println(response);
        System.out.println(response.getBody() +"\n");
    }

    @Test
    void findByEmail() {
        String url = baseUrl +"/login/" +employee.getEmail() +"/" +employee.getPassword();
        System.out.println("URL "+url);
        ResponseEntity<Employee> getResponse = restTemplate.getForEntity(url,Employee.class);
        System.out.println(getResponse.getBody());
        assertNotNull(getResponse.getBody());
        System.out.println("Employee: " +getResponse.getBody());

    }

    @Test
    void findAdminOrDriver() {
//        String url = baseUrl +"/DriverAdminLogin/" +employee.getEmployeeNumber();
//        System.out.println("URL "+url);
//        ResponseEntity<Employee> getResponse = restTemplate.getForEntity(url,Employee.class);
//        System.out.println(getResponse.getBody());
//        assertNotNull(getResponse.getBody());
//        System.out.println("Employee: " +getResponse.getBody());
    }
}