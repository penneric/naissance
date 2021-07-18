package sn.mit.edu.naissance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class NaissanceApplication implements  WebMvcConfigurer{

	public static void main(String[] args) {
		SpringApplication.run(NaissanceApplication.class, args);
	}

}
