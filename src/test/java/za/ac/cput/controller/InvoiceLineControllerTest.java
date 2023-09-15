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
import za.ac.cput.domain.InvoiceLine;
import za.ac.cput.factory.InvoiceFactory;
import za.ac.cput.factory.InvoiceLineFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class InvoiceLineControllerTest {

    private static InvoiceLine invoiceLine = InvoiceLineFactory.buildInvoiceLine("10","new",10, 12.3,52.3);
    @Autowired
    private TestRestTemplate restTemplate;
    private final String baseURL = "http://localhost:8080/invoiceline";
    @Test
    void a_create() {
        String url = baseURL +"/create";
        ResponseEntity<InvoiceLine> postResponse = restTemplate.postForEntity(url, invoiceLine, InvoiceLine.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        InvoiceLine savedInvoiceLine = postResponse.getBody();
        System.out.println("saved data: "+ savedInvoiceLine);
        assertEquals(invoiceLine.getInvoiceLineId(), savedInvoiceLine.getInvoiceLineId());
    }

    @Test
    void b_read() {
        String url = baseURL + "/read/" + invoiceLine.getInvoiceLineId();
        System.out.println("URL: "+ url);
        ResponseEntity<InvoiceLine> response = restTemplate.getForEntity(url, InvoiceLine.class);
        assertEquals(invoiceLine.getInvoiceLineId(), response.getBody().getInvoiceLineId());
        System.out.println(response.getBody());
    }

    @Test
    void c_update() {
        InvoiceLine updated = new InvoiceLine.Builder().copy(invoiceLine)
                .setLineTotalAmount(5000)
                .build();
        String url = baseURL + "/update/";
        System.out.println("URL: "+ url);
        System.out.println("post data"+ updated);
        ResponseEntity<InvoiceLine> response = restTemplate.postForEntity(url, updated, InvoiceLine.class);
    }

    @Test
    @Disabled
    void d_delete() {
        String url = baseURL + "/delete/" + invoiceLine.getInvoiceLineId();
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