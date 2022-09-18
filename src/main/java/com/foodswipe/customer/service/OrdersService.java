package com.foodswipe.customer.service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodswipe.customer.dao.CustomerDAO;
import com.foodswipe.customer.dao.OrdersDAO;
import com.foodswipe.customer.entity.Orders;
import com.foodswipe.customer.entity.Regedhotels;
import com.foodswipe.customer.entity.User_info;

@Service
public class OrdersService implements OrdersServiceInterface{

	@Autowired
	private OrdersDAO ordersDAO;
	
	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	public Orders saveOrder(Orders order) {
		// TODO Auto-generated method stub
		return this.ordersDAO.save(order);
	}

	@Override
	public void deleteOrder(Long orderId) {
		// TODO Auto-generated method stub
		ordersDAO.deleteById(orderId);
	}

	@Override
	public Orders updateOrder(Long orderId, Orders order) {
		// TODO Auto-generated method stub
		Orders or = ordersDAO.findById(orderId).get();
		or.setClient(order.getClient());
		or.setDelieveryadd(order.getDelieveryadd());
		or.setHotelorders(order.getHotelorders());
		or.setId(orderId);
		or.setItemid(order.getItemid());
		LocalDateTime myDateObj = LocalDateTime.now();
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	    String formattedDate = myDateObj.format(myFormatObj);
		or.setOrdertime(formattedDate);
		or.setQuantity(order.getQuantity());
		
		return this.ordersDAO.save(or);
	}

	@Override
	public List<Orders> getOrders(User_info user, Long hotelid) {
		// TODO Auto-generated method stub
		List<Orders> orders = ordersDAO.findByClient(user);
		List<Orders> returnOrders = new ArrayList<Orders>();
		for (Orders or : orders) {
			
			if (or.getHotelorders().getId() == hotelid)
				returnOrders.add(or);
		}
		
		return returnOrders;
	}

	

}
