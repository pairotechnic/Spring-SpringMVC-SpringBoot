package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//			We save the context
//			This is where Spring IoC container is initialized
//			It will try to create all the objects of classes with @Component annotation in here

		Alien a = context.getBean(Alien.class);
//			Dependency Injection
//			Spring will look inside Spring IoC container for bean of type Alien, and inject it here
//			Object is created by Spring Framework even without getBean method being called. 
//			So constructor of Alien class and all other components will still run
//			This is because Spring Framework, by default, uses Singleton design pattern
//			Objects are created the moment application is started

		a.show();

//		Alien a1 = context.getBean(Alien.class);
//			Even though we have a and a1 objects of Alien, the constructor only runs once
//			This is because by default Spring Framework uses Singleton Design Pattern
//			In Singleton, only one instance of each component is created

//			Scope of Alien class must be set to prototype if we want to create 2 distinct objects , constructor will run twice
//			If we set scope to prototype, then if object creation lines in this page are commented out, constructor won't run even once

//			So, in singleton , a & a1 are references to the same object
//			And, in prototype, a & a1 are separate objects

//		a1.show();
	}

}
