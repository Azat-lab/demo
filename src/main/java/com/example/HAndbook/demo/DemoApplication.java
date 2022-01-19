package com.example.HAndbook.demo;

import com.example.HAndbook.demo.entity.Country;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DemoApplication {

	public static void main(String[] args) {

		new Apllication().save(new Country("Java", 2314L, "Trolland"));
		SpringApplication.run(DemoApplication.class, args);
//		new Apllication().save(new Country("Java", 2314L, "Trolland"));


	}

}
