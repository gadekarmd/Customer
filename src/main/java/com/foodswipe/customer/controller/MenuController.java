package com.foodswipe.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodswipe.customer.entity.Menu;
import com.foodswipe.customer.entity.Regedhotels;
import com.foodswipe.customer.service.HotelServiceInterface;
import com.foodswipe.customer.service.MenuServiceInterface;

@RestController
@RequestMapping("/dashboard/{city}")
public class MenuController {

	@Autowired
	private MenuServiceInterface menuServ;
	
	@GetMapping("/{hotelid}")
	public List<Menu> showMenu(@PathVariable("hotelid") Long hotelid) {
		
		Regedhotels hotel = new Regedhotels();
		hotel.setId(hotelid);
		return menuServ.getMenu(hotel);
	}
}
