package com.jsondB.api.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsondB.api.domain.User;
import com.jsondB.api.service.UserServices;

@RestController
@RequestMapping("/users")
public class UserController {
	
	
	private UserServices userServices;

	public UserController(UserServices userServices) {
		super();
		this.userServices = userServices;
	}
	
	@GetMapping("/list")
	public Iterable<User> list(){
		
		return this.userServices.list();
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST, 
					consumes = MediaType.APPLICATION_JSON_VALUE, 
					produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Iterable<User> saveList( @RequestBody List<User> lists){
		
		System.out.println("Salvando usuário...");
		
		Iterable<User> userSave = this.userServices.save(lists);
		
		System.out.println("Usuário salvo com sucesso");
		
		return userSave;
	}

}
