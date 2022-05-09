package com.example.twilioTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class TwilioTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwilioTestApplication.class, args);
	}

}
