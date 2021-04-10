package com.setters;

public class Sheild {
	IronMan ironMan;

	public Sheild() {
		System.out.println("sheild is established");
	}

	public IronMan getIronMan() {
		return ironMan;
	}

	public void setIronMan(IronMan ironMan) {
		this.ironMan = ironMan;
	}

	void print() {
		System.out.println("Sheild is fortunate for having ironman");
	}

	void display() {
		print();
		ironMan.print();
	}

}
