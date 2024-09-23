package com.example.kafka_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafka_demo.service.KafkaSender;

@RestController
@RequestMapping(value = "/techacademyvisits-kafka/")
public class AppController {
	@Autowired
	KafkaSender kafkaSender;

	@GetMapping(value = "/producer")
	public String producer(@RequestParam("message") String message) {
		kafkaSender.send(message);
		return "Message sent to the Kafka Topic techacademyvisits-topic Successfully";
	}
}