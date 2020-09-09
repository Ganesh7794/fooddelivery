package fooddelivery.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fooddelivery.model.orderInfo;
import fooddelivery.model.restaurantsinfo;

@Service
public interface fooddeliveryservice {
	
	List<restaurantsinfo> getAllRestaurants();

	List<restaurantsinfo> getByStatus(Boolean openStatus);

	List<restaurantsinfo> getByRating();

	List<orderInfo> doCustomerOrder(restaurantsinfo orderedFood);
	
}
