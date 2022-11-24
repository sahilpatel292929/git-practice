package com.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitdemoApplication {

	public static void main(String[] args) {
		System.out.println("Master");
		System.out.println("Master 1");
		SpringApplication.run(GitdemoApplication.class, args);
	}

}
