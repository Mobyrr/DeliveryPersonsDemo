package com.ollcargo.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ollcargo.demo.model.DeliveryPersons;
import com.ollcargo.demo.repository.DeliveryPersonsRepository;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	DeliveryPersonsRepository deliveryPersonsRepository;

	@Test
	void listDeliveryUser() {
		List<DeliveryPersons> list = deliveryPersonsRepository.findAll();
		for (DeliveryPersons dp : list) {
			System.out.println(dp);
		}
	}

	@Test
	void addDeliveryUser() throws JsonMappingException, JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		String json = """
					{
						"userId": 123,
						"type": "standard delivery person",
						"transportation": "car",
						"maxWeight": 25,
						"canDeliverFragile": true,
						"mail": "livreur1@gmail.com",
						"pickupZones": [{"name": "Rouen"}],
						"dropoffZones": [{"name": "Rouen"}],
						"schedule": {
							"timezone": "France/paris",
							"sunday": [],
							"monday": [
								{"startTime": "09:00:00", "endTime": "17:00:00"}
							],
							"tuesday": [
								{"startTime": "09:00:00", "endTime": "17:00:00"}
							],
							"wednesday": [
								{"startTime": "09:00:00", "endTime": "17:00:00"}
							],
							"thursday": [
								{"startTime": "09:00:00", "endTime": "12:00:00"},
								{"startTime": "13:00:00", "endTime": "17:00:00"}
							],
							"friday": [
								{"startTime": "09:00:00", "endTime": "17:00:00"}
							],
							"saturday": []
						}
				}""";
		DeliveryPersons dp = objectMapper.readValue(json, DeliveryPersons.class);
		deliveryPersonsRepository.save(dp);
	}

}
