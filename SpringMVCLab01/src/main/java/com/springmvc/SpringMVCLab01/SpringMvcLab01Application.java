package com.springmvc.SpringMVCLab01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//@SpringBootApplication
//public class SpringMvcLab01Application {
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringMvcLab01Application.class, args);
//	}
//
//}

@SpringBootApplication
public class SpringMvcLab01Application extends SpringBootServletInitializer {
   @Override
   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
      return application.sources(SpringMvcLab01Application.class);
   }
   public static void main(String[] args) {
      SpringApplication.run(SpringMvcLab01Application.class, args);
   }
}