package com.telusko.SpringAnno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//	By mentioning @Configuration, the class AppConfig becomes responsible for giving objects
//	This class replaces the xml configuration file
@ComponentScan(basePackages = "com.telusko.SpringAnno")
//	Searches through all classes in given base package, with @Component annotation, and creates beans
//	We don't need to write methods with @Bean annotation, that return objects aka  beans
//	If we have multiple base packages, we can separate them with commas
public class AppConfig {

//	@Bean
//		In the AppConfig class, with the @Configuration annotation, for each function that returns an object of some class aka a bean, we need to provide @Bean annotation
//		The @Bean annotation replaces the <bean> tag from xml configuration file
//	public Samsung getPhone() {
//		return new Samsung();
//	}

//	@Bean
//	public MobileProcessor getProcessor() {
//		return new Snapdragon();
//	}
}
