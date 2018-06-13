package com.app;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class ServletInit extends SpringBootServletInitializer {

	@Override
	public SpringApplicationBuilder configure(SpringApplicationBuilder app)
	{
		
	  return     app.sources(SpringBootStudentApplication.class);
	}
	
}

