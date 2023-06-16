package com.navin.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

	@Autowired
	private Tyre tyre;
//		By adding the @Autowired annotation, it searches the spring.xml file for a bean definition with id="tyre", and creates an instance of the mentioned class in the definition.
//		If there is no bean definition with id="tyre", then context-component-scan in spring.xml will search through all classes with @Component annotation for the one that matches id="tyre", i.e., the class name should be Tyre, with a capital T, and creates an instance.

	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public void drive() {

//		System.out.println("Car class, drive() function");
		System.out.println("Car class, drive() function (" + tyre + ")");
	}
}
