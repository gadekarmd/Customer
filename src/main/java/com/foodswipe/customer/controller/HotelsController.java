package com.foodswipe.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodswipe.customer.entity.Menu;
import com.foodswipe.customer.entity.Regedhotels;
import com.foodswipe.customer.service.HotelServiceInterface;
import com.foodswipe.customer.service.MenuServiceInterface;

@RestController
@RequestMapping("/hotels")
public class HotelsController {

	@Autowired
	private HotelServiceInterface hotelServ;
	
	@GetMapping("/{city}") 
	public List<Regedhotels> gethotels(@PathVariable("city") String city) {
		
		return this.hotelServ.getHotels(city);
	}
	
	@GetMapping("all")
	public List<Regedhotels> findAll() {
		
		return this.hotelServ.findAll();
	}
}
