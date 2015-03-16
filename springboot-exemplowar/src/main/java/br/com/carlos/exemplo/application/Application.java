package br.com.carlos.exemplo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="br.com")
@EnableAutoConfiguration
public class Application  extends SpringBootServletInitializer{
	
	public static void main(String[] args) {
        SpringApplication.run(applicationClass, args);
    }
	
	private static Class<Application> applicationClass = Application.class;
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(applicationClass);
	}
	
	
	

	

}



