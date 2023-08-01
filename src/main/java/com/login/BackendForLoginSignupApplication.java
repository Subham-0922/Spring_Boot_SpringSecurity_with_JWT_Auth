package com.login;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendForLoginSignupApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BackendForLoginSignupApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("+==========================================+");
		System.out.println("+==== Application started successfully ====+");
		System.out.println("+==========================================+");

	}

}
