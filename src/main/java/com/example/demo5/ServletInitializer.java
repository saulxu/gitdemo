package com.example.demo5;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		System.out.println("test");
		System.out.println("test1");
		System.out.println("test2");
		System.out.println();
		return application.sources(Demo5Application.class);

	}

}
