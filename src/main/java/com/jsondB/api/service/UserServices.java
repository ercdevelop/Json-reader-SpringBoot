package com.jsondB.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jsondB.api.domain.User;
import com.jsondB.api.repository.UserRepository;



@Service
public class UserServices {
	
	private UserRepository userRepository;
	
	

	public UserServices(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	public Iterable<User> list(){
		return this.userRepository.findAll();
	}

	public User save(User user) {
		return this.save(user);
	}

	public Iterable<User> save(List<User> users) {
		return this.userRepository.saveAll(users);
	}
	
	

}
