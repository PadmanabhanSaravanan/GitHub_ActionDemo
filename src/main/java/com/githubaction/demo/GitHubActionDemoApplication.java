package com.githubaction.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitHubActionDemoApplication {
	
	@GetMapping("/welcome")
	public String Welcome() {
		
		return "Welcome to CI/CD Demo "
				+ "CI/CD is working";
		
		
	}

	public static void main(String[] args) {
		SpringApplication.run(GitHubActionDemoApplication.class, args);
	}

}