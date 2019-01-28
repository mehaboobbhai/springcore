package com.teamsankya.springcore;

import java.util.List;

public class Car {

	private String cName;
	private int cNo;
	private Engine engine;
	private List<Tyre> tyres;

	/*public Car(List<Tyre> tyres) {
		super();
		this.tyres = tyres;
	}*/

	public int getcNo() {
		return cNo;
	}

	public List<Tyre> getTyres() {
		return tyres;
	}

	public void setTyres(List<Tyre> tyres) {
		this.tyres = tyres;
	}

	public void setcNo(int cNo) {
		this.cNo = cNo;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	

	public Car() {
		System.out.println("default constructor......... " + this.getClass().getSimpleName());
	}

	public Car(int cNo) {
		this.cNo = cNo;
	}

	@Override
	public String toString() {
		return "Car [cName=" + cName + ", cNo=" + cNo + ", engine=" + engine + "]";
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public void getCarName() {
		System.out.println("mehaboob have " + cName + " car" + " with number is " + cNo  + "engine number is "+ engine.geteNo());
	}

}
