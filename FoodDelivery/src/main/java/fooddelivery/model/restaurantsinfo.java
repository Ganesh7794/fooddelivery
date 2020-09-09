package fooddelivery.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="RESTAURANTS_INFO")
public class restaurantsinfo {
	
	private long restaurantId;
	private String restaurantName;
	private String restaurantAddress;
	private int restaurantRating;
	private Boolean restaurantStatus;
	private Set<menuinfo> restaurantMenu;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "restaurant_id")
	public long getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(long restaurantId) {
		this.restaurantId = restaurantId;
	}
	
	@Column(name = "restaurant_name")
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	
	@Column(name = "restaurant_address")
	public String getRestaurantAddress() {
		return restaurantAddress;
	}
	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}
	
	@Column(name = "restaurant_rating")
	public int getRestaurantRating() {
		return restaurantRating;
	}
	public void setRestaurantRating(int restaurantRating) {
		this.restaurantRating = restaurantRating;
	}
	
	@Column(name = "restaurant_status")
	public Boolean getRestaurantStatus() {
		return restaurantStatus;
	}
	public void setRestaurantStatus(Boolean restaurantStatus) {
		this.restaurantStatus = restaurantStatus;
	}
	
	@OneToMany (cascade = CascadeType.ALL)
	@JoinColumn(name="fk_id",referencedColumnName = "restaurant_id")
	public Set<menuinfo> getRestaurantMenu() {
		return restaurantMenu;
	}
	public void setRestaurantMenu(Set<menuinfo> restaurantMenu) {
		this.restaurantMenu = restaurantMenu;
	}
}
