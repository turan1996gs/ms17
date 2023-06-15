package com.example.ms17;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Ms17Application {

	public static void main(String[] args) {
		//SpringApplication.run(Ms17Application.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		Person person = context.getBean("person", Person.class);
		person.callYourPet();
//		Pet pet = context.getBean("dog", Dog.class);
//		Person person = new Person(pet);
//		person.callYourPet();

		context.close();
	}

}
