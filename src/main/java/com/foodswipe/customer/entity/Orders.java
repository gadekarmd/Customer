package com.foodswipe.customer.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity

public class Orders
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	private  User_info client; //foreign key
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	private Regedhotels hotelorders;  //foreign key
	
	private Long itemid;   //foreign key
	private int quantity;
	private String ordertime;
	private String delieveryadd;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public User_info getClient() {
		return client;
	}
	public void setClient(User_info client) {
		this.client = client;
	}
	
	public Regedhotels getHotelorders() {
		return hotelorders;
	}
	public void setHotelorders(Regedhotels hotelorders) {
		this.hotelorders = hotelorders;
	}
	public long getItemid() {
		return itemid;
	}
	public void setItemid(long itemid) {
		this.itemid = itemid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(String ordertime) {
		this.ordertime = ordertime;
	}
	public String getDelieveryadd() {
		return delieveryadd;
	}
	public void setDelieveryadd(String delieveryadd) {
		this.delieveryadd = delieveryadd;
	}	
}
