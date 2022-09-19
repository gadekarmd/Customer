package com.foodswipe.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodswipe.customer.entity.User_info;
import com.foodswipe.customer.service.CustomerServiceInterface;

@RestController
@RequestMapping("/customer")
public class LoginController {

	@Autowired
	private CustomerServiceInterface custServ;
	
	@GetMapping("/login/{email}/{password}") 
	public User_info getCustomer(@PathVariable("email") String email, 
								@PathVariable("password") String password) throws Exception {
				
		return this.custServ.getCustomer(email, password);
	}
}
