package com.example.springboot.learnepringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ServiceController {
	
	@Autowired
	private CurrencyServiceConfiguration curent;
	@RequestMapping("/current")
	public CurrencyServiceConfiguration retrieveAll() {
		return curent;
		
	}
	

}
