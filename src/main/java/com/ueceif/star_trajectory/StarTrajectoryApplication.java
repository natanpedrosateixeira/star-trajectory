package com.ueceif.star_trajectory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StarTrajectoryApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StarTrajectoryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World!");
	}
}
