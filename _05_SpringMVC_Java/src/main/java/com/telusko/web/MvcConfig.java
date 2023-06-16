package com.telusko.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// The MvcConfig.java file will replace the Dispatcher servlet xml configuration file

@Configuration
@EnableWebMvc
//	We use @EnableWebMvc annotation, because we want to use annotation based configuration
@ComponentScan("com.telusko")
public class MvcConfig implements WebMvcConfigurer {

}
