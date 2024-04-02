package com.example.SimpleHelloWorldCLIAppLab1MidjanKacirani;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleHelloWorldCliAppLab1MidjanKaciraniApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SimpleHelloWorldCliAppLab1MidjanKaciraniApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World");
	}
}
