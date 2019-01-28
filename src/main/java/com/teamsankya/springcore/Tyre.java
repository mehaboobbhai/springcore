package com.teamsankya.springcore;

public class Tyre {
	
	
	private String tName;
	private double tWeight;
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public double gettWeight() {
		return tWeight;
	}
	public void settWeight(double tWeight) {
		this.tWeight = tWeight;
	}
	@Override
	public String toString() {
		return "Tyre [tName=" + tName + ", tWeight=" + tWeight + "]";
	}
	
	
	
	

}
