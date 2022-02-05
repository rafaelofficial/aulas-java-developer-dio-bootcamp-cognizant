package com.projetofeign2.agendatelefonica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AgendatelefonicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendatelefonicaApplication.class, args);
	}

}
