package com.example.configuration;

import javax.servlet.DispatcherType;
import javax.servlet.annotation.WebServlet;

import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;
import org.apache.struts2.dispatcher.servlet.StrutsServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class configue implements WebMvcConfigurer {  
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
	registry.jsp("/WEB-INF/jsp/", ".jsp");
	}
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	registry.addResourceHandler("/resources/**")
	.addResourceLocations("/resources/");
	}


    
    @Bean
    
    	    public FilterRegistrationBean someFilterRegistration() {
    	        FilterRegistrationBean registration = new FilterRegistrationBean();
    	        registration.setFilter(new StrutsPrepareAndExecuteFilter());
    	        registration.addUrlPatterns("*.action");
    	        registration.setDispatcherTypes(DispatcherType.REQUEST, DispatcherType.FORWARD);
    	        registration.setName("StrutsPrepareAndExecuteFilter");
    	        return registration;
    
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}