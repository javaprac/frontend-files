package com.login.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;
import static com.login.initialization.InitializationConstants.PREFIX;
import static com.login.initialization.InitializationConstants.SUFFIX;
import static com.login.initialization.InitializationConstants.FTL_LOCATION;

@Configuration
public class LoginRegistrationFreemarkerConfig {
	@Bean
	public FreeMarkerViewResolver freeMarkerViewResolver(){
		FreeMarkerViewResolver viewResolver = new FreeMarkerViewResolver();
		viewResolver.setPrefix(PREFIX);
		viewResolver.setSuffix(SUFFIX);
		
		return viewResolver;
	}
	
	@Bean
	public InternalResourceViewResolver internalViewResolver(){
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix(SUFFIX);
		viewResolver.setSuffix(SUFFIX);
		return viewResolver;
	}
	
	@Bean
	public FreeMarkerConfigurer freeMarkerConfigurer() {
		FreeMarkerConfigurer configurer = new FreeMarkerConfigurer();
		configurer.setTemplateLoaderPath(FTL_LOCATION);
		return configurer;
	}
}
