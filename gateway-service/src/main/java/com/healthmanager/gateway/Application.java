package com.healthmanager.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Application {

	public static void main(final String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
