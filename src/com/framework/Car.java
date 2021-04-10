package com.framework;

public class Car {
    private String carModel;
    private String carColor;
    private Engine engine;//aggregation
	public Car(String carModel, String carColor, Engine engine) {
		super();
		this.carModel = carModel;
		this.carColor = carColor;
		this.engine = engine;
	}
    void show(){
    	System.out.println("car model :"+carModel+" ,car color is :"+carColor);
    	System.out.println(engine);
    }
    
}
