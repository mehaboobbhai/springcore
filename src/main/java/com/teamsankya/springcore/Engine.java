package com.teamsankya.springcore;

public class Engine {

	private int eNo;

	public Engine(int eNo) {
		super();
		this.eNo = eNo;
	}

	public int geteNo() {
		return eNo;
	}

	@Override
	public String toString() {
		return "Engine [eNo=" + eNo + "]";
	}

	/*public void seteNo(int eNo) {
		this.eNo = eNo;
	}*/

}
