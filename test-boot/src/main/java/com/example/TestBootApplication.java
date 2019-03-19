package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestBootApplication {

	public static void main(String[] args) {
		
		User user = new User();		
		user.setName("hero");
		System.out.println(user.getName());

	}

}
