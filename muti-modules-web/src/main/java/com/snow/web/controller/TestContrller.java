package com.snow.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snow.service.test.TestService;

@RestController
public class TestContrller {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping("/test")
	public String test(){
		return testService.test();
	}
}
