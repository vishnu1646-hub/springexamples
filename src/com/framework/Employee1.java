package com.framework;

public class Employee1 {
	private int id;
	private String name;
	private Address1 address;

	public Employee1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee1(int id, String name, Address1 address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void show() {
		System.out.println(id + " " + name);
		System.out.println(address);
	}

}
