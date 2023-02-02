package com.projeto.hotel;

import com.projeto.hotel.model.entity.Customer;
import com.projeto.hotel.model.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Calendar;

@SpringBootApplication
public class HotelApplication{

	public static void main(String[] args) {
		SpringApplication.run(HotelApplication.class, args);


	}

	@Bean
	CommandLineRunner initDatabase(CustomerRepository customerRepository) {
		return args -> {
			customerRepository.deleteAll();
			Customer c = new Customer();
			c.setCpf("08725613995");
			c.setName("Tieli");
			c.setBirthdate(Calendar.getInstance());
			c.setGender("Feminino");
			c.setMobile("48996925185");

			customerRepository.save(c);
		};
	}
}
