package com.teamsankya.springcore.coreproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	public static void main(String[] args) {

	/*	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(PetConfig.class,AnimalConfig.class);
		Animal animal = (Animal) applicationContext.getBean("dogbean");
		animal.eat();
		animal.sleep();

		Pet pet =  (Pet) applicationContext.getBean("petbean");
		
//		pet.setAnimal(animal);
		pet.dosomething();
		applicationContext.close();*/
		
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.getEnvironment().setActiveProfiles("Animal","Pet");
		applicationContext.register(AnimalConfig.class,PetConfig.class);
		applicationContext.refresh();
		
		Pet pet = applicationContext.getBean(Pet.class);
		System.out.println(pet.toString());
		System.out.println(pet.getAnimal().toString());

		
		
		
	}

}
