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
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.InvoiceLine;
import za.ac.cput.domain.StorageUnit;
import za.ac.cput.factory.InvoiceLineFactory;
import za.ac.cput.factory.StorageUnitFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class StorageUnitControllerTest {

    private static StorageUnit storageUnit = StorageUnitFactory.buildStorageUnit("EN835620","very big",87,78,56,95,78);

    @Autowired
    private TestRestTemplate restTemplate;
    private final String baseURL = "http://localhost:8080/storageUnit";
    @Test
    void a_create() {

        String url = baseURL +"/create";
        ResponseEntity<StorageUnit> postResponse = restTemplate.postForEntity(url, storageUnit, StorageUnit.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        StorageUnit savedStorageUnit = postResponse.getBody();
        System.out.println("saved data: "+ savedStorageUnit);
        assertEquals(storageUnit.getUnitId(), savedStorageUnit.getUnitId());
    }

    @Test
    void b_read() {
        String url = baseURL + "/read/" + storageUnit.getUnitId();
        System.out.println("URL: "+ url);
        ResponseEntity<StorageUnit> response = restTemplate.getForEntity(url, StorageUnit.class);
        assertEquals(storageUnit.getUnitId(), response.getBody().getUnitId());
        System.out.println(response.getBody());
    }

    @Test
    void c_update() {
        StorageUnit updated = new StorageUnit.Builder().copy(storageUnit).setUnitSizeDescription("small").build();
        String url = baseURL + "/updated";
        System.out.println("URL:"+ url);
        System.out.println("Post data:" + updated);
        ResponseEntity <StorageUnit> response = restTemplate.postForEntity(url, updated, StorageUnit.class);
        assertNotNull(response.getBody());

    }

    @Test
    @Disabled
    void e_delete() {
        String url = baseURL + "/delete/" + storageUnit.getUnitId();
        System.out.println("URL : " +url);
        restTemplate.delete(url);


    }
    @Test
    void d_getAll() {
        String url = baseURL + "/getAll";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null,headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET,entity,String.class);
        System.out.println("Show All :");
        System.out.println(response);
        System.out.println(response.getBody());
    }

    @Test
    void getStorageUnitBySize() {
    }
}