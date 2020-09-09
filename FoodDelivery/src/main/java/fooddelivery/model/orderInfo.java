package fooddelivery.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_info")
public class orderInfo {
	
	private long orderId;
	private String userName;
	private String restaurantName;
	private List<orderMenu> orderedFood;
	private String orderAddress;
	private Double totalCost;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	
	@Column(name = "user_name")
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Column(name = "restaurant_name")
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	
	@Column(name = "ordered_food")
	public List<orderMenu> getOrderedFood() {
		return orderedFood;
	}
	public void setOrderedFood(List<orderMenu> orderedFood) {
		this.orderedFood = orderedFood;
	}
	
	@Column(name = "order_address")
	public String getOrderAddress() {
		return orderAddress;
	}
	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}
	
	@Column(name = "total_cost")
	public Double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

}
