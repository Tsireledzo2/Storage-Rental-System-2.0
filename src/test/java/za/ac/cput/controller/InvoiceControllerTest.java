package za.ac.cput.controller;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Invoice;
import za.ac.cput.factory.InvoiceFactory;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class InvoiceControllerTest {

    private static Invoice invoice = InvoiceFactory.builddInvoice("10", 6000, "chris", new Date(2025,3,8));
    @Autowired
    private TestRestTemplate restTemplate;
    private final String baseURL = "http://localhost:8080/invoice";
    @Test
    void a_create() {
        String url = baseURL +"/create";
        ResponseEntity<Invoice> postResponse = restTemplate.postForEntity(url, invoice, Invoice.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        Invoice savedinvoice = postResponse.getBody();
        System.out.println("saved data: "+ savedinvoice);
        assertEquals(invoice.getInvoiceNumber(), savedinvoice.getInvoiceNumber());
    }

    @Test
    void b_read() {
        String url = baseURL + "/read/" + invoice.getInvoiceNumber();
        System.out.println("URL: "+ url);
        ResponseEntity<Invoice> response = restTemplate.getForEntity(url, Invoice.class);
        assertEquals(invoice.getInvoiceNumber(), response.getBody().getInvoiceNumber());
        System.out.println(response.getBody());
    }

    @Test
    void c_update() {
        Invoice updated = new Invoice.Builder().copy(invoice)
                .setCustomerName("mukuna")
                .build();
        String url = baseURL + "/update/";
        System.out.println("URL: "+ url);
        System.out.println("post data"+ updated);
        ResponseEntity<Invoice> response = restTemplate.postForEntity(url, updated, Invoice.class);

    }

    @Test
    @Disabled
    void d_delete() {
        String url = baseURL + "/delete/" + invoice.getInvoiceNumber();
        System.out.println("URL: "+ url);
        restTemplate.delete(url);
    }

    @Test
    void e_getAll() {
        String url = baseURL +"/getall/" ;
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println("show all: ");
        System.out.println(response.getBody());
        System.out.println(response.getBody());
    }
}