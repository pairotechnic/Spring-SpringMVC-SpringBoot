package com.telusko.SpringAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {

//		Samsung s7 = new Samsung();
//		s7.config();
//			We won't use this method of object creation using "new" keyword, because we want to use dependency injection feature of Spring

		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
//			Here we specify which configuration class we are working with, in this case, it is AppConfig
//			We can use multiple configuration files, instead of just AppConfig, if we want

		Samsung s7 = factory.getBean(Samsung.class);
		s7.config();
	}
}
