package com.teamsankya.springcore.coreproject;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Pet {

	private String name;
	@Autowired
	@Qualifier("catbean")
	private Animal animal;

	public void dosomething() {
		animal.eat();
		animal.sleep();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	@PostConstruct
	public void init() {
		System.out.println("initializating bean");
	}
	@PreDestroy
	public void destroy() {
	System.out.println("Destroy");
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", animal=" + animal + "]";
	}

}
