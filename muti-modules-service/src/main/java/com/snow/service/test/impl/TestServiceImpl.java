package com.snow.service.test.impl;

import org.springframework.stereotype.Service;

import com.snow.common.pojo.Test;
import com.snow.service.test.TestService;

@Service
public class TestServiceImpl implements TestService{

	public String test(){
		Test test = new Test();
		test.setId(1);
		test.setAge(2);
		test.setName("test");
		return test.toString();
	}
}
