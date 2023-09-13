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
import org.springframework.http.ResponseEntity;
import za.ac.cput.domain.Driver;
import za.ac.cput.domain.Employee;
import za.ac.cput.factory.DriverFactory;
import za.ac.cput.factory.EmployeeFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(DriverControllerTest.TestConfig.class)
class DriverControllerTest {

    @TestConfiguration
    static class TestConfig {
        // Define any necessary beans for your test here
        @Bean
        public TestRestTemplate testRestTemplate() {
            return new TestRestTemplate();
        }
    }

    public Employee employee = EmployeeFactory.buildEmployee("44345345","Makhado","Tsireledzo","221116273@mycput.ac.za","4646644");
    public Driver driver = DriverFactory.buildDriver("1234567","Driver",employee);

    @Autowired
    private TestRestTemplate restTemplate;

    private String baseUrl ="http://localhost:8080";

    @Test
    public void create() {
        String url = baseUrl +"/driver/createDriver";
        ResponseEntity<Driver> postResponse = restTemplate.postForEntity(url, driver,Driver.class);
        assertNotNull(postResponse);
        System.out.println(postResponse);
        assertNotNull(postResponse.getBody());
        Driver driver1 = postResponse.getBody();
        System.out.println("Saved Student " + driver1);
        assertNotNull(driver1.getLicence_number());
    }

    @Test
    void read() {
        // Implement your read test
    }

    @Test
    void update() {
        // Implement your update test
    }

    @Test
    void delete() {
        // Implement your delete test
    }

    @Test
    void getAll() {
        // Implement your getAll test
    }
}
