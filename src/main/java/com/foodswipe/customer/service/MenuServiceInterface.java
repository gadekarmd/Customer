package com.foodswipe.customer.service;

import com.foodswipe.customer.entity.Regedhotels;

import java.util.List;

import com.foodswipe.customer.entity.Menu;

public interface MenuServiceInterface {

	public List<Menu> getMenu(Regedhotels hotel);
}
