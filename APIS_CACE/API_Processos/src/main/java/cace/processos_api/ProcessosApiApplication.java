package cace.processos_api;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "cace.processos_api.model")
@EnableJpaRepositories(basePackages = "cace.processos_api.repository")
public class ProcessosApiApplication {

	@Value("${spring.datasource.url:NOT_DEFINED}")
	private String dbUrl;

	public static void main(String[] args) {
		SpringApplication.run(ProcessosApiApplication.class, args);
	}

	@PostConstruct
	public void logEnv() {
		System.out.println("==== DATABASE_URL ====");
		System.out.println("spring.datasource.url: " + dbUrl);
		System.out.println("======================");
	}
}
