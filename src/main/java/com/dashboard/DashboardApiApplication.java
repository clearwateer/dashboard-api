package com.dashboard;
import com.dashboard.services.AuthService;
import com.dashboard.services.IAuthService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.dashboard.services")
public class DashboardApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(DashboardApiApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/auth-javaconfig").allowedOrigins("http://localhost:4200");
			}
		};
	}

	@Bean
	public IAuthService asClient(){
		return new AuthService();
	}
}
