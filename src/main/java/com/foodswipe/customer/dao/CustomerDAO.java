package com.foodswipe.customer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.foodswipe.customer.entity.User_info;

public interface CustomerDAO extends JpaRepository<User_info, Long>{

	User_info findByEmail(String email);

	@Query("from User_info c where c.email=:email and c.password=:password")
	User_info findByPassword(@Param("email") String email,@Param("password") String password);
}
