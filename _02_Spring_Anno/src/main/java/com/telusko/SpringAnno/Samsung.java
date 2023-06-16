package com.telusko.SpringAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//	For Samsung class, by default, the name of the bean is "samsung", Non Qualified and De Capitalized name of the class
//	@Component is equivalent to @Component("samsung")
//	We can change the name of the bean, by writing a different name in parentheses, such as "mySamsung" 
//	eg : @Component("mySamsung")
public class Samsung {

	@Autowired
//		By adding @Autowired annotation, it goes to AppConfig class, with @Configuration annotation, searches through all the @Bean functions, for the one with return type of MobileProcessor.
//		In annotation configuration, @Autowired annotation searches based on return type of @Bean methods, rather than their names
//		In case we use @ComponentScan annotation in AppConfig class, the configuration class, it searches through all classes with @Component annotation in the mentioned basePackage and creates a bean of class that implements MobileProcessor
	@Qualifier("mediaTek")
//		In case there are multiple beans that implement MobileProcessor, We can specify which class's bean we want to create by writing @Qualifier annotation, and passing the bean name in parentheses
//		@Qualifier annotation in Samsung class, takes precedence over @Primary annotation of Snapdragon class or MediaTek class
	MobileProcessor cpu;

	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() {

		System.out.println("Octa Core, 4 GB RAM, 12 MP camera");
		cpu.process();
	}
}
