package com.telusko;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//This class does the job of web.xml file

public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] { TeluskoConfig.class };
//			Here, the getServletConfigClasses() method as a return type of array of classes
//			The return statement gives TeluskoConfig.class which has an @ComponentScan annotation
//			Thus all the classes with @Controller annotation are returned
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] { "/" };
	}

}
