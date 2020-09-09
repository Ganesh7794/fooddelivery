package fooddelivery.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;

import fooddelivery.service.fooddeliveryservice;
import fooddelivery.service.impl.fooddeliveryserviceimpl;

@EnableAutoConfiguration
public class fooddeliveryconfig {
	
		@Bean
		public fooddeliveryservice fooddelivery() {
			return new fooddeliveryserviceimpl();
		}
		
		@Bean
		public HibernateJpaSessionFactoryBean sessionFactory() {
		    return new HibernateJpaSessionFactoryBean();
		}
		
		@Bean
	    public EntityManager entityManager(EntityManagerFactory entityManagerFactory) {
	        return entityManagerFactory.createEntityManager();
	    }
}
