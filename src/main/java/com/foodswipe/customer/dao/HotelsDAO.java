package com.foodswipe.customer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.foodswipe.customer.entity.Regedhotels;

public interface HotelsDAO extends JpaRepository<Regedhotels, Long>{

	@Query("from com.foodswipe.customer.entity.Regedhotels r where r.city=:city")
	List<Regedhotels> findByCity(@Param("city") String city);
}
