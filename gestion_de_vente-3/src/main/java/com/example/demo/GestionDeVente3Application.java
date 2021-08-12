package com.example.demo;

import javax.servlet.DispatcherType;

import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EntityScan("com.projet.j2ee.models.g_vente")

@ComponentScan(basePackages ={"com.projet.j2ee.struts.controller","com.hello","com.projet.j2ee.service.g_vente.Implementation"})
@EnableJpaRepositories("com.projet.j2ee.repos.g_vente")
@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class GestionDeVente3Application {

	public static void main(String[] args) {
		SpringApplication.run(GestionDeVente3Application.class, args);
	}
	 @Bean
	    
	    public FilterRegistrationBean someFilterRegistration() {
	        FilterRegistrationBean registration = new FilterRegistrationBean();
	        registration.setFilter(new StrutsPrepareAndExecuteFilter());
	        registration.addUrlPatterns("*.action");
	        registration.setDispatcherTypes(DispatcherType.REQUEST, DispatcherType.FORWARD);
	        registration.setName("StrutsPrepareAndExecuteFilter");
	        return registration;}
}
