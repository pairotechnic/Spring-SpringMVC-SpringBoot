package com.telusko.SpringAnno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
//	In Samsung class, we are trying to create a bean of type MobileProcessor, an interface, but both Snapdragon class as well as MediaTek class implement the interface, and both classes have @Component annotation, so Spring doesn't know which class's bean it should create
//	When there is such a conflict, we use @Primary annotation along with @Component annotation to tell Spring that the class with @Primary annotation should be given priority, and it should create bean of that class
public class MediaTek implements MobileProcessor {

	public void process() {

		System.out.println("2nd Best CPU");
	}

}
