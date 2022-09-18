package com.foodswipe.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodswipe.customer.entity.Orders;
import com.foodswipe.customer.entity.Regedhotels;
import com.foodswipe.customer.entity.User_info;
import com.foodswipe.customer.service.CustomerServiceInterface;
import com.foodswipe.customer.service.HotelServiceInterface;
import com.foodswipe.customer.service.OrdersServiceInterface;

@RestController
@RequestMapping("/orders")
public class OrdersController {

	@Autowired
	private OrdersServiceInterface orderServ;

	@Autowired
	private CustomerServiceInterface custServ;

	@Autowired
	private HotelServiceInterface hotelServ;

	@PostMapping("/add/{userid}/{hotelid}")
	public Orders addOrder(@PathVariable("userid") Long userid, @PathVariable("hotelid") Long hotelid) {

		User_info user = custServ.getCustomer(userid);
		Regedhotels hotel = hotelServ.getHotels(hotelid);
		Orders or = new Orders();
		or.setClient(user);
		or.setHotelorders(hotel);
		return this.orderServ.saveOrder(or);
	}

	@PutMapping("/edit/{userid}/{hotelid}")
	public Orders updateOrder(@PathVariable("userid") Long userid, @PathVariable("hotelid") Long hotelid) {

		User_info user = custServ.getCustomer(userid);
		Regedhotels hotel = hotelServ.getHotels(hotelid);
		Orders or = new Orders();
		or.setClient(user);
		or.setHotelorders(hotel);
		return this.orderServ.saveOrder(or);
	}
	
	@DeleteMapping("/delete/{orderid}")
	public void deleteOrder(@PathVariable("orderid") Long orderid) {
		
		this.orderServ.deleteOrder(orderid);
	}
	
	@GetMapping("/all/{userid}/{hotelid}")
	public List<Orders> showAll(@PathVariable("userid") Long userid, @PathVariable("hotelid") Long hotelid) {
		
		User_info user  = new User_info();
		user.setId(userid);
		return this.orderServ.getOrders(user, hotelid);
	}
}
