package com.telusko.SpringDemo;

import org.springframework.stereotype.Component;

//	AOP - Aspect Oriented Programming
//		It supports OOP - Object Oriented Programming of Java, and is a supplement for it
//	Cross Cutting Concerns
//		These are placed in an Aspect

@Component
public class Alien {

	public void show() {

//		Business logic lines of code

		System.out.println("Hello World");
	}

}
