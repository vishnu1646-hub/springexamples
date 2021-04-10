package com.setters;

public class Aquaman {
    private static final Aquaman aqua = new Aquaman();

	private Aquaman() {
		System.out.println("Auqman underground");
	}
	public static Aquaman getAquaman(){
		System.out.println("Welcome to Aquaman");
		return aqua;
	}
    public void message(){
    	System.out.println("Hello machoman aquaman");
    }
	
}
