package com.framework;

public class Employee {
	private int id;
	private String name;

	public Employee() {
		System.out.println("printing from default constructor");
	}
    public Employee(int id){
    	this.id = id;
    }
    public Employee(String name){
    	this.name = name;
    }
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	void show(){
		System.out.println("Student id :"+id+" & name is :"+name);
	}

}
