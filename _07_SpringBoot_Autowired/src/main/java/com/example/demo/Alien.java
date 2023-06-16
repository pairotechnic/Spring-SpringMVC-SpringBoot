package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype")
//	Singleton scope creates only one instance of each component 
//	These are created the moment the application starts

//	Prototype scope however doesn't create any instances of component classes by default
//	The moment you call getBean method, it creates an instance of required component
//	It can create as many instances as required

public class Alien { // Alien is a POJO

	private int aid;
	private String aname;
	private String tech;
	@Autowired
//		Since Alien class has a field of type Laptop class, it means Alien is dependent on Laptop
//		Beans in the Spring container aren't aware of eachother's existence
//		@Autowired, by default, searches for beans by type
//		By writing @Autowired annotation, it searches the container for bean of type Laptop and injects it
	@Qualifier("lappy")
//		We use @Qualifier("bean name") if when using @Autowired, we want to search for beans by name, rather than type
//		The bean name must be the same as the one from @Component("bean name") of the required class
//		If no custom name is given, we write bean name in @Qualifier as class name with first letter lower case
	private Laptop laptop;

	public Alien() {
		super();
		System.out.println("Alien object created");
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void show() {
		System.out.println("in show");
		laptop.compile();
	}

}
