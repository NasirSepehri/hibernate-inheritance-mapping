package com.example.hibernateinheritancemapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@EnableConfigurationProperties
public class HibernateInheritanceMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateInheritanceMappingApplication.class, args);
	}

}
