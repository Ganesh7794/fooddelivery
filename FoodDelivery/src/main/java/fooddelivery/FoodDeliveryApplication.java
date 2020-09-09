package fooddelivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import fooddelivery.dao.fooddeliverydao;

@EnableAsync
@EnableScheduling
@SpringBootApplication(scanBasePackages = { "fooddelivery" })
public class FoodDeliveryApplication implements CommandLineRunner  {

	@Autowired
	fooddeliverydao fooddeliverydao;
	
	public static void main(String[] args) {
		SpringApplication.run(FoodDeliveryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
