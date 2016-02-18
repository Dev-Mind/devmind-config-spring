package com.devmind.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevmindPropertiesApplication {

	public static void main(String[] args) {
		for(String arg : args){
			System.out.println("Devmind app argument " + arg);
		}
		SpringApplication.run(DevmindPropertiesApplication.class, args);
	}
}
