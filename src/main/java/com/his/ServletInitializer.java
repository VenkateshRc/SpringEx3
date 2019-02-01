package com.his;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/**
 * This class is used to initialize the spring boot application
 * @author MANJUNATHA JEERLA
 *
 */
public class ServletInitializer extends SpringBootServletInitializer {

	/**
	 * this constrctor is used to know whether the object is created or not
	 */
	ServletInitializer() {
	super();
	}
	
	/**
	 * This method is used to iinitailize a spring builder object
	 */
	
	@Override
	protected SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
		return application.sources(HealthInsuranceAppApplication.class);
	}

}

