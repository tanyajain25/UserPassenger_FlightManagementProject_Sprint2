package org.cap.passengermngt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
/**
 * this is equal to three annotations
 * 1) @Configuration
 * 2)@ComponentScan
 * 3)@EnableAutoConfiguration
 */
@SpringBootApplication
@EnableTransactionManagement
public class PassengerManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassengerManagementApplication.class, args);
		
	}
		@Bean
		public CorsFilter corsFilter(){
			UrlBasedCorsConfigurationSource src=new UrlBasedCorsConfigurationSource();
			CorsConfiguration configuration=new CorsConfiguration();
			configuration.setAllowCredentials(true);
			configuration.addAllowedHeader("*");
			configuration.addAllowedOrigin("*");
			configuration.addAllowedMethod("*");
			src.registerCorsConfiguration("/**",configuration);
			return new CorsFilter(src);
		
	}


}
