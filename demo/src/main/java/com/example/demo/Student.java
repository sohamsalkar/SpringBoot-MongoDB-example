package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Student {
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	
	private Gender gender;
	private Address address;
	
	private List<String> subjects ;
	private BigDecimal totalSpendInBooks;
	private LocalDateTime createAt;
	
	public Student(String firstName, String lastName, String email, Gender gender, Address address,
			List<String> subjects, BigDecimal totalSpendInBooks,LocalDateTime createAt) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.address = address;
		this.subjects = subjects;
		this.totalSpendInBooks = totalSpendInBooks;
		this.createAt = createAt;
	}
	
	
}
