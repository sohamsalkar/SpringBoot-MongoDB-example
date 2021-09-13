package com.example.demo;
import com.example.demo.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		
	}
	
	@Bean
	CommandLineRunner runner(StudentRepository repository,MongoTemplate mongoTemplate)
	{
		return args -> {
			
			Address address = new Address("India","421201","dombivli");
			String email = "sohsal@gmail.com" ;
			Student student = new Student( "soham" , "salkar",email, Gender.MALE, address, 
							List.of("DSA"), BigDecimal.TEN, LocalDateTime.now()
							);
			Query query = new Query();
			query.addCriteria(Criteria.where("email").is(email));
			mongoTemplate.find(query,Student.class);
			repository.insert(student);
			
		};
	}

}
