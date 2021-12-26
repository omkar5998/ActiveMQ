package com.example.demo.producer;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

	@Autowired
	JmsTemplate jmsTemplate;
	
	@Autowired
	Queue queue;
	
	public String sendMessage(String message) {
		jmsTemplate.setDefaultDestination(queue);
		jmsTemplate.convertAndSend(message);
		return "Published Successfully";
	}
}
