package com.actions.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
    Dotenv dotenv = Dotenv.load();
		dotenv.entries().forEach(entry -> {
			System.setProperty(entry.getKey(), entry.getValue());
		});

    String ACTOR = dotenv.get("ACTOR");
    System.out.println(ACTOR + " is learning GitHub Actions");

    String LANGUAGE = dotenv.get("LANGUAGE");
    System.out.println(LANGUAGE + " is my favorite language");

		SpringApplication.run(DemoApplication.class, args);
	}

}
