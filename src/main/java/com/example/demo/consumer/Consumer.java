package com.example.demo.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
	
	@JmsListener(destination = "standalone.queue")
	public void consume(String message) {
		System.out.println("Message Received : " + message);
	}
}
