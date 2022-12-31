package com.projeto.hotel;

import com.projeto.hotel.model.entity.Access;
import com.projeto.hotel.model.repository.AccessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HotelApplication implements CommandLineRunner {

	@Autowired
	private AccessRepository accessRepository;

	public static void main(String[] args) {
		SpringApplication.run(HotelApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Access a1 = new Access(1L, "tieli", "456123");
		Access a2 = new Access(2L, "Matheus", "114863");

		accessRepository.save(a1);
		accessRepository.save(a2);
	}
}
