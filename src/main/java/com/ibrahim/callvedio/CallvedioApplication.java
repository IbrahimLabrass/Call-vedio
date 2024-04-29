package com.ibrahim.callvedio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CallvedioApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			UserService service
	) {
		return args -> {
			service.register(User.builder()
							.username("Ali")
							.email("ali@mail.com")
							.password("aaa")
					.build());

			service.register(User.builder()
					.username("John")
					.email("john@mail.com")
					.password("aaa")
					.build());

			service.register(User.builder()
					.username("Anny")
					.email("anna@mail.com")
					.password("aaa")
					.build());
		};
	}

}