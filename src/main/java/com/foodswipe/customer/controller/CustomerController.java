package com.foodswipe.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodswipe.customer.entity.Regedhotels;
import com.foodswipe.customer.entity.User_info;
import com.foodswipe.customer.service.CustomerServiceInterface;
import com.foodswipe.customer.service.HotelServiceInterface;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerServiceInterface custServ;
		
	@PostMapping("/register")
	public User_info createUser(@RequestBody User_info cust) throws Exception {
		
		return this.custServ.createCustomer(cust);
	}
	
	@GetMapping("/login/{email}/{password}") 
	public User_info getCustomer(@PathVariable("email") String email, 
								@PathVariable("password") String password) throws Exception {
				
		return this.custServ.getCustomer(email, password);
	}
	
	@GetMapping("all") 
	public List<User_info> showAll() {
		
		return this.custServ.findAll();
	}
}
