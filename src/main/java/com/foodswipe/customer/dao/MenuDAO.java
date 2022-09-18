package com.foodswipe.customer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.foodswipe.customer.entity.Menu;
import com.foodswipe.customer.entity.Regedhotels;

public interface MenuDAO extends JpaRepository<Menu, Long>{

	List<Menu> findByHotel(Regedhotels hotel);
}
