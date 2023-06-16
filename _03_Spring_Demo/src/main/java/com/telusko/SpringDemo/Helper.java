package com.telusko.SpringDemo;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//	Advice - What should be called
//		Types of advice - Before, After, etc
//	PointCut - Where 

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {

	@Before("execution(public void show())")
	public void log() {
		System.out.println("log called");
	}

	public void security() {
		System.out.println("security called");
	}

}
