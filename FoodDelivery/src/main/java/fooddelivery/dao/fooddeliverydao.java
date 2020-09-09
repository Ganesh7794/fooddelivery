package fooddelivery.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fooddelivery.model.restaurantsinfo;

@Repository
public interface fooddeliverydao extends JpaRepository<restaurantsinfo, Long> {
	
	List<restaurantsinfo> findAll();
	
}
