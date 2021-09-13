package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;



@AllArgsConstructor
@Data
public class Address {
	
	public Address(String country, String postcode, String city) {
		super();
		this.country = country;
		this.postcode = postcode;
		this.city = city;
	}
	private String country;
	private String postcode;
	private String city;
	
}
