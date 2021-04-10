package com.framework;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Rangerover {
	private String company;
	private String owner;
	private Map<String, String> details;

	public Rangerover(String company, String owner, Map<String, String> details) {
		super();
		this.company = company;
		this.owner = owner;
		this.details = details;
	}

	public void display() {
		System.out.println("Car Company is :" + company);
		System.out.println("Directive Group is :" + owner);
		Set<Entry<String, String>> set = details.entrySet();
		Iterator<Entry<String, String>> iterating = set.iterator();
		while (iterating.hasNext()) {
			Entry<String, String> entry = iterating.next();
			System.out.println("Model of car :" + entry.getKey() + " purchased by :" + entry.getValue());
		}
	}
}
