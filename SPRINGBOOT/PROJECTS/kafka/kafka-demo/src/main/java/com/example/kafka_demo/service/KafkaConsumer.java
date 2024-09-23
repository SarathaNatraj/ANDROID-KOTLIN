package com.example.kafka_demo.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
	@Autowired
	private KafkaTemplate<Long, String> template;

	@KafkaListener(topics = "techacademyvisits-topic", groupId = "my-group", containerFactory = "orderListener")
// Method
	public void consume(String order) {
// Print statement
		System.out.println("message = " + order);
	}
}
