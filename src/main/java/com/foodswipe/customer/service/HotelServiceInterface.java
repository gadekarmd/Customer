package com.foodswipe.customer.service;

import java.util.List;

import com.foodswipe.customer.entity.Menu;
import com.foodswipe.customer.entity.Regedhotels;

public interface HotelServiceInterface {

	public List<Regedhotels> getHotels(String city);

	public Regedhotels getHotels(Long hotelid);

	public List<Regedhotels> findAll();
	
}
