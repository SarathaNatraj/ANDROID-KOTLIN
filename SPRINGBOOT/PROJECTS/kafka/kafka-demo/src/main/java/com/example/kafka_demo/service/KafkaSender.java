package com.example.kafka_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	String kafkaTopic = "wipro-kotlin";

	public void send(String message) {
		kafkaTemplate.send(kafkaTopic, message);
	}
}