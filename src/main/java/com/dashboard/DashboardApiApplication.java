package com.dashboard;
import com.dashboard.services.AuthService;
import com.dashboard.services.IAuthService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.dashboard.services")
public class DashboardApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(DashboardApiApplication.class, args);
	}

	@Bean
	public IAuthService asClient(){
		return new AuthService();
	}
}
