package com.teamsankya.springcore.coreproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration
@Import(AnimalConfig.class)
public class PetConfig {

	@Bean(name = "dogbean")
	public Animal getDog() {

		return new Dog();
	}

	@Bean(name = "catbean")
	public Animal getCat() {

		return new Cat();
	}

	@Bean(name = "petbean")
	@Scope("prototype")
	public Pet getPet() {
		return new Pet();
	}

}
