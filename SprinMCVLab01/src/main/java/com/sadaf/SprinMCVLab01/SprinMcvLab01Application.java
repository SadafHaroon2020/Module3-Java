package com.sadaf.SprinMCVLab01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//@SpringBootApplication
//public class SprinMcvLab01Application {
//
//	public static void main(String[] args) {
//		SpringApplication.run(SprinMcvLab01Application.class, args);
//	}
//
//}

@SpringBootApplication
public class SprinMcvLab01Application extends SpringBootServletInitializer {
   @Override
   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
      return application.sources(SprinMcvLab01Application.class);
   }
   public static void main(String[] args) {
      SpringApplication.run(SprinMcvLab01Application.class, args);
   }
}