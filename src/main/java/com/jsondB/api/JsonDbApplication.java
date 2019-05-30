package com.jsondB.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jsondB.api.service.UserServices;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import com.jsondB.api.domain.User;

@SpringBootApplication
public class JsonDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonDbApplication.class, args);
	}
	
	
	@Bean
	CommandLineRunner runner(UserServices services) {
		return args -> {
			
			ObjectMapper objt = new ObjectMapper();
			TypeReference<List<User>> typeReference = new TypeReference<List<User>>() {};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/users.json");
			
			try {
				List<User> users = objt.readValue(inputStream, typeReference);
				services.save(users);
				System.out.println("Users saved");
				
			} catch (IOException e) {
				System.out.println("Unable to save : " + e.getMessage());
			}
			
		};
	}
}
