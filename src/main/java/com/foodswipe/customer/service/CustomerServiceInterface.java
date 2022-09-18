package com.foodswipe.customer.service;

import java.util.List;

import com.foodswipe.customer.entity.Regedhotels;
import com.foodswipe.customer.entity.User_info;

public interface CustomerServiceInterface {

	public User_info createCustomer(User_info customer);

	public User_info getCustomer(String email, String password);

	public User_info getCustomer(Long id);

	public List<User_info> findAll();
}
