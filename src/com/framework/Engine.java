package com.framework;

public class Engine {
       private String hp;
       private String engineType;
       private String engineCar;
	public Engine(String hp, String engineType, String engineCar) {
		super();
		this.hp = hp;
		this.engineType = engineType;
		this.engineCar = engineCar;
	}
    public String toString(){
    	return "Engine horsepower:"+hp+" ,Engine type :"+engineType+" ,Engine fitted car :"+engineCar;
    }
}
