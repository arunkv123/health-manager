package com.healthmanager.doctor.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class SearchControllerTest {

	@Autowired
	TestRestTemplate restTemplate;

	@Test
	public void testGetAllDocttorsEndPoint() throws Exception {
		ResponseEntity<Object> response = restTemplate.getForEntity("/search/all", Object.class);
		assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
	}
}
