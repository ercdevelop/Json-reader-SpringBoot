package com.jsondB.api.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id; 
    private String name;
    private String username;
    private String email;
    private String phone;
    private String website;
    
    @Embedded
    private Adress address;
    
    @Embedded
    private Company company;

	public User() {
		super();
		
	}
    
    



}
