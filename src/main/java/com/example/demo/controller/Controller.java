package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.producer.Producer;

@RestController
@RequestMapping("/send")
public class Controller {

	@Autowired
	Producer producer;

	@GetMapping("/{message}")
	public String sendMessage(@PathVariable("message") final String message) {
		
		return producer.sendMessage(message);
	}
}
