package fooddelivery.service.impl;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import fooddelivery.dao.fooddeliverydao;
import fooddelivery.model.orderInfo;
import fooddelivery.model.orderMenu;
import fooddelivery.model.restaurantsinfo;
import fooddelivery.service.fooddeliveryservice;
import net.bytebuddy.utility.RandomString;

public class fooddeliveryserviceimpl implements fooddeliveryservice {

	@Autowired
	private fooddeliverydao fooddeliverydao;
	
	@Override
	public List<restaurantsinfo> getAllRestaurants() {
		return fooddeliverydao.findAll();
	}

	@Override
	public List<restaurantsinfo> getByStatus(Boolean openStatus) {
		return fooddeliverydao.findAll().stream().filter(status -> status.getRestaurantStatus()== Boolean.TRUE).collect(Collectors.toList());
	}

	@Override
	public List<restaurantsinfo> getByRating() {
		List<restaurantsinfo> ratingSortList = fooddeliverydao.findAll();
		return ratingSortList.stream().sorted(Comparator.comparing(restaurantsinfo::getRestaurantRating)).collect(Collectors.toList());
	}

	@Override
	public List<orderInfo> doCustomerOrder(restaurantsinfo orderedFood) {
		orderInfo orderInfo = new orderInfo();
		orderInfo.setRestaurantName(orderedFood.getRestaurantName());
		orderedFood.getRestaurantMenu().forEach(getfood -> {
			orderInfo.setTotalCost(getfood.getQuantity() * getfood.getPrice());
			orderMenu orderMenu= new orderMenu();
			orderMenu.setFoodName(getfood.getFoodName());
			orderMenu.setPrice(getfood.getPrice());
			orderMenu.setQuantity(getfood.getQuantity());
			orderInfo.setOrderedFood(Arrays.asList(orderMenu));
		});
		orderInfo.setUserName(new RandomString().toString());
		orderInfo.setOrderAddress("chennai");
		return Arrays.asList(orderInfo);
	}

}
