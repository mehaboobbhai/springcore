package com.teamsankya.springcore.coreproject;

public class Cat  implements Animal{

	@Override
	public void eat() {
System.out.println("cat wil drink milk");		
	}

	@Override
	public void sleep() {
System.out.println("after that cat wil sleep");		
	}

	@Override
	public String toString() {
		return "Cat [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	

}
