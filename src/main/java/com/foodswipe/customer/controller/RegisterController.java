package com.foodswipe.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodswipe.customer.entity.User_info;
import com.foodswipe.customer.service.CustomerServiceInterface;

@RestController
@RequestMapping("/customer")
public class RegisterController {

	@Autowired
	private CustomerServiceInterface custServ;
		
	@PostMapping("/register")
	public User_info createUser(@RequestBody User_info cust) throws Exception {
		
		return this.custServ.createCustomer(cust);
	}
}
