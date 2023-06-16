package com.telusko;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//This class, using @Configuration annotation becomes the configuration class for dispatcher servler
//It does the job of telusko-servlet.xml

@Configuration
@ComponentScan({ "com.telusko" })
//	If we had multiple packages with controllers, we can add them as well in the braces
//	eg : {"com.telusko", "com.abcd", "com.xyz"}
public class TeluskoConfig {

	@Bean
	public InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/");
//			Here we specify the path, by mentioning the folder containing the display file, in this case WEB-INF
//			When Controllers use setViewName("name-of-display-page") it will look through the path folder specified in setPrefix to find it
//			In this case, AddController attempts to set view name to "display", so spring will look through the pages in WEB-INF for display file
		vr.setSuffix(".jsp");
//			To change the view technology, all we have to do it is change the extension in setSuffix, we don't have to touch any other code
//			eg : change .jsp to .xhtml

		return vr;
	}
}
