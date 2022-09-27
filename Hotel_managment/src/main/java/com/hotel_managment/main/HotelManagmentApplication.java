package com.hotel_managment.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class HotelManagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelManagmentApplication.class, args);
	}

}
