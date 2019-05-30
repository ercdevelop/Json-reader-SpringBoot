package com.jsondB.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.jsondB.api.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	

}
