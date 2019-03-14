package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cc=SpringApplication.run(Demo1Application.class, args);
		System.out.println(cc.getBeanDefinitionCount()+"is Count");
		String h[]=cc.getBeanDefinitionNames();
		for(int a=0;a<cc.getBeanDefinitionCount();a++)
		{
			System.out.println(h[a]);
		}
		Test r=cc.getBean("Test", Test.class);
		System.out.println(r.test());
	}
}
