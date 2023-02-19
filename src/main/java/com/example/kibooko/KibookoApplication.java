package com.example.kibooko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



//@SpringBootApplication
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@RestController
public class KibookoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KibookoApplication.class, args);
	}
	@GetMapping("/hello")
			public String sayHello(@RequestParam(value= "myName", defaultValue ="World") String name){
			return String.format("Hello %s!", name);
		}


}
