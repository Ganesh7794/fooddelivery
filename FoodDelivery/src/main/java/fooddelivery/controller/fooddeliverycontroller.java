package fooddelivery.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fooddelivery.model.orderInfo;
import fooddelivery.model.restaurantsinfo;
import fooddelivery.service.fooddeliveryservice;

@RestController
public class fooddeliverycontroller {
	
	private fooddeliveryservice fooddeliveryservice;
	
	@GetMapping("/getAllRestaurants")
    public List<restaurantsinfo> getAllRestaurants() {
		return fooddeliveryservice.getAllRestaurants();
    }
    
    @GetMapping("/getByStatus")
    public List<restaurantsinfo> getByStatus() {
		return fooddeliveryservice.getByStatus(Boolean.TRUE);
    }
    
    @GetMapping("/getByRating")
    public List<restaurantsinfo> getByRating() {
		return fooddeliveryservice.getByRating();
    }
    
    @GetMapping("/doCustomerOrder")
    public List<orderInfo> doCustomerOrder(@RequestParam restaurantsinfo orderedFood) {
		return fooddeliveryservice.doCustomerOrder(orderedFood);
    }
}