package com.teamsankya.springcore.coreproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
/* @Import(PetConfig.class) */
@Profile("Animal")
public class AnimalConfig {

	@Bean(name = "cat")
	public Animal getCat() {
		return new Cat();
	}

}
