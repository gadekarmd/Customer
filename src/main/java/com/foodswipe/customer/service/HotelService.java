package com.foodswipe.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodswipe.customer.dao.HotelsDAO;
import com.foodswipe.customer.dao.MenuDAO;
import com.foodswipe.customer.entity.*;

@Service
public class HotelService implements HotelServiceInterface{

	@Autowired
	private HotelsDAO hotelsDAO;
	
	@Override
	public List<Regedhotels> getHotels(String city) {
		
		return this.hotelsDAO.findByCity(city);
	}

	@Override
	public Regedhotels getHotels(Long hotelid) {
		// TODO Auto-generated method stub
		return this.hotelsDAO.findById(hotelid).get();
	}

	@Override
	public List<Regedhotels> findAll() {
		// TODO Auto-generated method stub
		return this.hotelsDAO.findAll();
	}
}
