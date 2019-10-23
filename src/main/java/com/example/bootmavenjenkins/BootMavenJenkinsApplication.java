package com.example.bootmavenjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootMavenJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMavenJenkinsApplication.class, args);
	}
	@GetMapping("/")
	public String sayHello(){
		return "Hello from Cloudbees Jenkins";
	}

}
