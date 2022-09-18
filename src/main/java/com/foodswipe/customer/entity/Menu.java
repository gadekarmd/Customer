package com.foodswipe.customer.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Menu
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String category;            /*(veg/nonveg)(dropdown)*/
	
	public Menu() { }
	
	public Regedhotels getHotel() {
		return hotel;
	}
	public void setHotel(Regedhotels hotel) {
		this.hotel = hotel;
	}
	private String itemtype;            /*(starters ,maincourseetc)(dropdown)*/
	private String itemname;
	private int price;
	private boolean available;
	private String itemimage;			//(String link to foreign resource)
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	private Regedhotels hotel;
	
	// getters and setters are here
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getItemtype() {
		return itemtype;
	}
	public void setItemtype(String itemtype) {
		this.itemtype = itemtype;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public String getItemimage() {
		return itemimage;
	}
	public void setItemimage(String itemimage) {
		this.itemimage = itemimage;
	}
	
	
}
