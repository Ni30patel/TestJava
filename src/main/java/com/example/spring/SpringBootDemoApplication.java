package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
//		SpringApplicationBuilder app = new SpringApplicationBuilder(SpringBootDemoApplication.class);
//				app.build().addListeners(new ApplicationPidFileWriter("./bin/shutdown.pid"));
//				app.run();
				System.out.println("Third run of spring boot app");
	}

}
