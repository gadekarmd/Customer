package com.foodswipe.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodswipe.customer.dao.CustomerDAO;
import com.foodswipe.customer.dao.HotelsDAO;
import com.foodswipe.customer.entity.Regedhotels;
import com.foodswipe.customer.entity.User_info;

@Service
public class CustomerService implements CustomerServiceInterface {

	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	public User_info createCustomer(User_info customer) {
		// TODO Auto-generated method stub
		User_info cust = this.customerDAO.findByEmail(customer.getEmail());
		
		if (cust != null) {
			
			System.out.println("User is already registered!!");
			return cust;
		} 
		
		return this.customerDAO.save(customer);
	}

	@Override
	public User_info getCustomer(String email, String password) {
		// TODO Auto-generated method stub
		User_info cust = this.customerDAO.findByEmail(email);
		
		if (cust == null) {
			
			System.out.println("User is not registered with this email address!!");
			
		} else {
			
			cust = this.customerDAO.findByPassword(email, password);
			if (cust == null) {
				
				System.out.println("Incorrect password");
			}
		}
		
		return cust;
	}

	@Override
	public User_info getCustomer(Long id) {
		// TODO Auto-generated method stub
		return customerDAO.findById(id).get();
	}

	@Override
	public List<User_info> findAll() {
		// TODO Auto-generated method stub
		return this.customerDAO.findAll();
	}

}
