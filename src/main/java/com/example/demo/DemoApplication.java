package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
//
//		ApplicationContext context = SpringApplication.run(Application.class,args);
//		for(String beanName : context.getBeanDefinitionNames()){
//			System.out.print(beanName);
//		}
////		 demoController안에 들어가 있는 함수들을 가져온다
//		DemoController controller = (DemoController)context.getBean("demoController");
//		System.out.println(controller.address());
	}

}
