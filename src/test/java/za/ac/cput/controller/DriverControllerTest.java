package za.ac.cput.controller;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import za.ac.cput.domain.Driver;
import za.ac.cput.domain.Employee;
import za.ac.cput.factory.DriverFactory;
import za.ac.cput.factory.EmployeeFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DriverControllerTest {


    public Employee employee = EmployeeFactory.buildEmployee("Makhado","Tsireledzo","2211516273@mycput.ac.za","4646644");
    public Driver driver = DriverFactory.buildDriver("1234567","Driver",employee);

    @Autowired
    private TestRestTemplate restTemplate;

    private String baseUrl ="http://localhost:8080";

    @Test
    public void a_create() {
        String urlE = baseUrl +"/createEmployee";
        ResponseEntity<Employee> postResponseE = restTemplate.postForEntity(urlE, employee,Employee.class);
        String url = baseUrl +"/driver/createDriver";
        ResponseEntity<Driver> postResponse = restTemplate.postForEntity(url, driver,Driver.class);
        assertNotNull(postResponse);
        System.out.println(postResponse);
        assertNotNull(postResponse.getBody());
        Driver driver1 = postResponse.getBody();
        System.out.println("Saved Driver " + driver1);
        assertNotNull(driver1.getLicence_number());
    }

    @Test
    public void b_read() {
        String url = baseUrl +"/driver/readDriver/" +driver.getLicence_number();
        System.out.println("URL " +url);
        ResponseEntity<Driver> getResponse = restTemplate.getForEntity(url,Driver.class);
        System.out.println(getResponse.getBody());
        assertNotNull(getResponse.getBody());
        assertEquals(driver.getLicence_number(),getResponse.getBody().getLicence_number());
        System.out.println("Driver: " +getResponse.getBody());
    }

    @Test
    public void c_update() {
        String url = baseUrl +"/driver/updateDriver";
        Driver updateStudent = new Driver.Builder().copy(driver).setLicence_number("123456789").buildDriver();
        System.out.println("URL "+url);
        ResponseEntity<Driver> postResponse = restTemplate.postForEntity(url,updateStudent,Driver.class);
        assertNotNull(postResponse.getBody());
    }

    @Test
    public void f_delete() {
        String url = baseUrl +"/driver/deleteDriver/" +driver.getLicence_number();
        System.out.println("URL "+url);
        restTemplate.delete(url);
    }

    @Test
    public void e_getAll() {
        String url = baseUrl +"/driver/getAllDrivers";
        HttpHeaders httpHeaders = new HttpHeaders();
        HttpEntity<String> httpEntity = new HttpEntity<>(null,httpHeaders);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET,httpEntity,String.class);
        System.out.println("ALl Drivers");
        System.out.println(response);
        System.out.println(response.getBody() +"\n");
    }
}
