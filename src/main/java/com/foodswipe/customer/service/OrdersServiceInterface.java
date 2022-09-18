package com.foodswipe.customer.service;

import java.util.List;

import com.foodswipe.customer.entity.Orders;
import com.foodswipe.customer.entity.User_info;

public interface OrdersServiceInterface {

	public Orders saveOrder(Orders order);
	public void deleteOrder(Long orderId);
	public Orders updateOrder(Long orderId, Orders order);
	public List<Orders> getOrders(User_info user, Long hotelid);
}
