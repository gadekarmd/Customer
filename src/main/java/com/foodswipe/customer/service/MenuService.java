package com.foodswipe.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodswipe.customer.dao.MenuDAO;
import com.foodswipe.customer.entity.Menu;
import com.foodswipe.customer.entity.Regedhotels;

@Service
public class MenuService implements MenuServiceInterface{

	@Autowired
	private MenuDAO menuDAO;
	
	@Override
	public List<Menu> getMenu(Regedhotels hotel) {
		// TODO Auto-generated method stub
		return menuDAO.findByHotel(hotel);
	}
}
