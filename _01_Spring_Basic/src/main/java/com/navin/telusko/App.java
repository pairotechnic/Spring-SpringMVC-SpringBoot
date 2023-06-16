package com.navin.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

//		Using Class to create objects
//		Car car = new Car();
//		car.drive();
//
//		Bike bike = new Bike();
//		bike.drive();

//		Using Interface to create objects
//		Vehicle vehicle1 = new Car();
//		vehicle1.drive();
//
//		Vehicle vehicle2 = new Bike();
//		vehicle2.drive();

//		Using ApplicationContext to create a bean
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // searches through all bean
																						// definitions in spring.xml
																						// file

//		Using bean to create object of interface
//		Vehicle obj1 = (Vehicle) context.getBean("vehicle");
//			1. getBean gives object of type Object, which must be typecasted to type Vehicle by writing Vehicle in parentheses

//			2. getBean searches through all bean definitions for the one where id = "vehicle" and creates an object of corresponding class mentioned in bean definition, in this case, Car

//			3. Here, neither Bike nor Car class are mentioned. The code is independent of the classes of which objects must be created. This is how dependency injection is used. To create object of a different class, we must go to spring.xml and change the class in the bean definition

//			4. No java code is changed when spring.xml is changed, so it only has to be saved. not recompiled

//		obj1.drive();

//		Here, we use annotation configuration instead of xml configuration
//		Vehicle obj2 = (Vehicle) context.getBean("car");
//			car is the default name of the bean. It is non-qualified, decapitalized, basically first-letter-lowercase name of the Class of which a bean is created.
//		obj2.drive();

//		Vehicle obj3 = (Vehicle) context.getBean("bike");
//		obj3.drive();

//		Tyre t = (Tyre) context.getBean("tyre");
//		System.out.println(t);
//			This prints the toString() method of Tyre class object

		Car obj4 = (Car) context.getBean("car");
		obj4.drive();
	}
}
