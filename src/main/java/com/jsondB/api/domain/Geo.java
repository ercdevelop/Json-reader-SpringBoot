package com.jsondB.api.domain;

import java.math.BigDecimal;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Embeddable
public class Geo {
	
    
    private BigDecimal lat;
    private BigDecimal lng;
    
	public Geo() {
		super();
		
	}
    
    


}
