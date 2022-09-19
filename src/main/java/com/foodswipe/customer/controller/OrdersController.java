package com.foodswipe.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodswipe.customer.entity.Orders;
import com.foodswipe.customer.entity.Regedhotels;
import com.foodswipe.customer.entity.User_info;
import com.foodswipe.customer.service.CustomerServiceInterface;
import com.foodswipe.customer.service.HotelServiceInterface;
import com.foodswipe.customer.service.OrdersServiceInterface;

@RestController
@RequestMapping("/customer/dashboard/orders")
public class OrdersController {

	@Autowired
	private OrdersServiceInterface orderServ;

	@Autowired
	private CustomerServiceInterface custServ;

	@Autowired
	private HotelServiceInterface hotelServ;

	@PostMapping("/addorders")
	public List<Orders> addOrder(@RequestBody List<Orders> orders) {

		return this.orderServ.saveOrders(orders);
	}

	
	@GetMapping("/all/{userid}/{hotelid}")
	public List<Orders> showAll(@PathVariable("userid") Long userid, @PathVariable("hotelid") Long hotelid) {
		
		User_info user  = new User_info();
		user.setId(userid);
		return this.orderServ.getOrders(user, hotelid);
	}
}
