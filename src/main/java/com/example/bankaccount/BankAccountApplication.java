package com.example.bankaccount;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
public class BankAccountApplication implements CommandLineRunner {
	@Autowired
	private JdbcTemplate template;
	public static void main(String[] args) {
		SpringApplication.run(BankAccountApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		template.execute("");
	}
}
