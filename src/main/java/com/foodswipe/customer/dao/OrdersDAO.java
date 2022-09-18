package com.foodswipe.customer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodswipe.customer.entity.Orders;
import com.foodswipe.customer.entity.Regedhotels;
import com.foodswipe.customer.entity.User_info;

public interface OrdersDAO extends JpaRepository<Orders, Long>{

	List<Orders> findByClient(User_info user);

}
