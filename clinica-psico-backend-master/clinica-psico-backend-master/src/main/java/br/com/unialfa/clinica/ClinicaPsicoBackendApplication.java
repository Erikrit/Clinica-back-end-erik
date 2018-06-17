package br.com.unialfa.clinica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@SpringBootApplication
public class ClinicaPsicoBackendApplication {

	@Bean
	public WebFluxConfigurer corsConfigurer() {
		return new WebFluxConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**");
			}
		};
	}
	public static void main(String[] args) {
		SpringApplication.run(ClinicaPsicoBackendApplication.class, args);
	}
}
