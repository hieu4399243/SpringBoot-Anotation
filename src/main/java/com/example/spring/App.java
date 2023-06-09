package com.example.spring;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

		//Outfit outfit = (Outfit) context.getBean("bikini");

//		System.out.println("Instance: " + outfit);
//
//		outfit.wear();
//
//	Girl girl = context.getBean(Girl.class);
//		System.out.println(girl);
//		System.out.println("Outfit: " + girl.outfit);
//		girl.outfit.wear();


		GirlService girlService = context.getBean(GirlService.class);
		int id = 1;
		Girl girl = girlService.findGirlById(id);
		System.out.printf("Found Girl with id: " + id);
		System.out.println(girl);


	}

}
