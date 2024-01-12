package com.Dentisto;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;


import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration


public class DatabaseLoader {
	
	 private UserRepository repo;
     
	    public DatabaseLoader(UserRepository repo) {
	        this.repo = repo;
	    }
	    
	    @Bean
	    public CommandLineRunner initializeDatabase() {
	        return args -> {
	            User user1 = new User("secretaireAdmin@gmail.com", "admin123", Role.ADMIN);
	            User user2 = new User("DR.medcin@gmail.com", "medcin123", Role.USER);
	            
	           // User user3 = new User("houssam", "nam2022", Role.USER);
	          //  User user4 = new User("ravi@gmail.com", "ravi2121", Role.USER);
	             
	            repo.saveAll(List.of(user1, user2));
	             
	            System.out.println("Database initialized");
	        };
	    }

}
