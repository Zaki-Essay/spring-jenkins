package com.javatechie.jenkin.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class SpringJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	/*
	@GetMapping("/ping")
	public String message() {
		return "Wao!! Application Deployed successfully in SAP Cloud..";
	}*/

	@PostConstruct
	public void init(){
		logger.info( "init executing hello, i add some new changes in **init** methode...");
	}

	public static void main(String[] args) {

		SpringApplication.run(SpringJenkinsApplication.class, args);
		logger.info("SpringJenkinsApplication executing, **CI/CD**...");
	}

}
